package homeWork2;

import homeWork1.database.entity.Vehicle;
import homeWork2.pattern.adapter.ArrayToStringAdapter;
import homeWork2.pattern.adapter.IPrinter;
import homeWork2.pattern.adapter.Printer;
import homeWork2.pattern.adapter.Writer;
import homeWork2.pattern.bridge.PowerController.ChargingPowerController;
import homeWork2.pattern.bridge.PowerController.FastChargingPowerController;
import homeWork2.pattern.bridge.PowerController.PowerController;
import homeWork2.pattern.bridge.battery.AbstractBattery;
import homeWork2.pattern.bridge.battery.Battery;
import homeWork2.pattern.bridge.battery.FastChargeableBattery;
import homeWork2.pattern.bridge.battery.RechargeableBattery;
import homeWork2.pattern.composite.Data;
import homeWork2.pattern.composite.Folder;
import homeWork2.pattern.decorator.TextDao;
import homeWork2.pattern.decorator.TextDaoImpl;
import homeWork2.pattern.decorator.TextEncryptionDao;
import homeWork2.pattern.facade.Car;
import homeWork2.pattern.facade.CarStarterFacade;
import homeWork2.pattern.flyweight.FlyWeightPointFactory;
import homeWork2.pattern.proxy.*;

public class Launcher {
    public static void main(String[] args) {

        //adapter
        Printer printer = new Printer();
        IPrinter adapter = new ArrayToStringAdapter(printer);
        Writer writer = new Writer(adapter);
        writer.writeToPrinter();

        //bridge
        AbstractBattery battery = new Battery();
        AbstractBattery rechargeableBattery = new RechargeableBattery();
        AbstractBattery fastChargeableBattery = new FastChargeableBattery();

        PowerController powerController = new PowerController(battery);
        powerController.takeCharge();
        ChargingPowerController chargingPowerController = new ChargingPowerController(rechargeableBattery);
        chargingPowerController.charge();
        FastChargingPowerController fastPowerController = new FastChargingPowerController(fastChargeableBattery);
        fastPowerController.fastCharge();

        //composite
        Data data0 = new Data(1000);
        Data data1 = new Data(4500);
        Data data2 = new Data(40);
        Folder folder = new Folder();
        folder.addFile(data0);
        folder.addFile(data1);
        Folder folder2 = new Folder();
        folder2.addFile(data2);
        folder2.addFile(folder);
        System.out.println(folder2.getSize());

        //decorator
        String text = "hello";
        TextDao textDao = new TextDaoImpl();
        textDao.saveText(text);
        System.out.println(textDao.getText());
        TextDao encryptedDao = new TextEncryptionDao(textDao);
        encryptedDao.saveText(text);
        System.out.println(encryptedDao.getText());

        //facade
        CarStarterFacade facade = new CarStarterFacade();
        Car car = new Car();
        facade.startCar(car);

        //flyweight
        for (int i = 0; i < 10; i++) {
            FlyWeightPointFactory.createPoint(1, 1, Vehicle.VehicleType.CAR);
        }

        //proxy
        IData dataService = new DataService();
        IData cashedProxy = new CashedProxy(dataService);
        System.out.println(cashedProxy.getName());
        System.out.println(cashedProxy.getName());
        User user = new User(User.UserType.ADMIN);
        IData securedProxy = new SecuredProxy(user, dataService);
        System.out.println(securedProxy.getName());
        System.out.println(securedProxy.getPassword());
    }
}
