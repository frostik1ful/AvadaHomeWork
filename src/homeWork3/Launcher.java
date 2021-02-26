package homeWork3;

import homeWork3.pattern.chain.*;
import homeWork3.pattern.command.*;
import homeWork3.pattern.interpreter.Context;
import homeWork3.pattern.iterator.*;
import homeWork3.pattern.mediator.ChatUser;
import homeWork3.pattern.mediator.Mediator;
import homeWork3.pattern.mediator.MediatorImpl;
import homeWork3.pattern.memento.ControlPanel;
import homeWork3.pattern.memento.TextEditor;
import homeWork3.pattern.observer.*;
import homeWork3.pattern.state.GearBox;
import homeWork3.pattern.strategy.*;
import homeWork3.pattern.templateMethod.JeepCar;
import homeWork3.pattern.templateMethod.OldCar;
import homeWork3.pattern.templateMethod.TeslaCar;
import homeWork3.pattern.templateMethod.Vehicle;
import homeWork3.pattern.visitor.FuelFiller;
import homeWork3.pattern.visitor.Visitable;
import homeWork3.pattern.visitor.Visitor;
import homeWork3.pattern.visitor.powerPlant.CoalPlant;
import homeWork3.pattern.visitor.powerPlant.NuclearPlant;
import homeWork3.pattern.visitor.powerPlant.WaterPlant;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        //chain
        ExchangeElement firstElement = new USDElement(new EURElement(new UAHElement(new JPYElement())));
        System.out.println(firstElement.calculateValue(CurrencyType.UAH, CurrencyType.EUR,1000));
        //command
        TextView textView = new TextView();
        DatabaseService service = new DatabaseService();

        Command getUsersCommand = new UserCommand(textView,service);
        Command getPasswordCommand = new PasswordCommand(textView,service);
        Command getEmailCommand = new EmailCommand(textView,service);

        Button showUsersButton = new Button();
        Button showPasswordsButton = new Button(getPasswordCommand);
        Button showEmailsButton = new Button(getEmailCommand);

        showUsersButton.setCommand(()->textView.setText(service.getUsers().toString()));

        showUsersButton.click();
        showPasswordsButton.click();
        showEmailsButton.click();
        //interpreter
        Context context = new Context("1-12+33+4");
        context.findResult();
        //iterator
        List<User> users = List.of(
                new User("Dima", User.UserType.ADMIN),
                new User("Kostya", User.UserType.USER),
                new User("Alex", User.UserType.USER),
                new User("Max", User.UserType.ADMIN),
                new User("Mike", User.UserType.USER));

        Iterator userIterator = new UserIterator(users);
        Iterator adminIterator = new AdminIterator(users);
        Iterator backWardsUserIterator = new BackWardsUserIterator(users);
        while (userIterator.hasNext()){
            System.out.println(userIterator.getNext());
        }
        System.out.println();
        while (adminIterator.hasNext()){
            System.out.println(adminIterator.getNext());
        }
        System.out.println();
        while (backWardsUserIterator.hasNext()){
            System.out.println(backWardsUserIterator.getNext());
        }

        //mediator
        List<ChatUser> chatUsers = new ArrayList<>();
        users.forEach(user -> chatUsers.add(new ChatUser(user.getName(),user.getUserType())));

        Mediator userMediator = new MediatorImpl(chatUsers);

        chatUsers.forEach(user -> user.setMediator(userMediator));
        chatUsers.get(0).writeMessage();
        chatUsers.get(1).writeMessage();
        //memento
        TextEditor editor = new TextEditor();
        ControlPanel panel = new ControlPanel(editor);
        panel.writeTitle("title1");
        panel.writeText("text1");
        System.out.println(editor);
        panel.writeText(" text2");
        System.out.println(editor);
        panel.stepBack();
        System.out.println(editor);
        panel.stepBack();
        System.out.println(editor);
        //observer
        Publisher postOffice = new PostOffice();
        Subscriber sub0 = new SubUser("Dima");
        Subscriber sub1 = new SubUser("Kostya");
        Subscriber sub2 = new SubUser("Alex");
        Subscriber sub3 = new SubUser("Max");
        Subscriber sub4 = new SubUser("Mike");

        postOffice.subscribe(sub0, NewsPaper.PaperType.NEWS);
        postOffice.subscribe(sub1, NewsPaper.PaperType.TVPROGRAMM);
        postOffice.subscribe(sub2, NewsPaper.PaperType.PUZZLES);
        postOffice.subscribe(sub3, NewsPaper.PaperType.NEWS);
        postOffice.subscribe(sub4, NewsPaper.PaperType.NEWS);

        postOffice.subscribe(sub0, NewsPaper.PaperType.PUZZLES);

        postOffice.addNewsPaper(new NewsPaper(NewsPaper.PaperType.PUZZLES));

        postOffice.unsubscribe(sub0);
        //state
        GearBox gearBox = new GearBox();
        gearBox.setDriveMode();
        gearBox.setRearMode();
        gearBox.setNeutralMode();
        //strategy
        PlayerStrategy musicStrategy = new MusicStrategy();
        PlayerStrategy videoStrategy = new VideoStrategy();
        PlayerStrategy imageStrategy = new ImageStrategy();

        MediaPlayer player = new MediaPlayer();
        player.setStrategy(musicStrategy);
        player.play();

        player.setStrategy(videoStrategy);
        player.play();

        player.setStrategy(imageStrategy);
        player.play();
        //templateMethod
        Vehicle oldCar = new OldCar();
        Vehicle teslaCar = new TeslaCar();
        Vehicle jeepCar = new JeepCar();

        oldCar.start();
        teslaCar.start();
        jeepCar.start();
        //visitor
        Visitor fuelFiller = new FuelFiller();
        List<Visitable> powerPlants = List.of(new CoalPlant(),new WaterPlant(),new NuclearPlant());
        powerPlants.forEach(plant->plant.visit(fuelFiller));


    }
}
