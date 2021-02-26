package homeWork3.pattern.mediator;

import homeWork3.pattern.iterator.User;

public class ChatUser extends User {
    private Mediator mediator;
    public ChatUser(String name, UserType userType) {
        super(name, userType);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void writeMessage(){
        if (getUserType() == UserType.USER){
            mediator.sendMessages("hello to users !",this);
        }
        else {
            mediator.sendMessages("hello to admins !",this);
        }

    }

    public void addMessage(String message){
        System.out.println(getUserType()+" "+getName()+" received message "+message);
    }
}
