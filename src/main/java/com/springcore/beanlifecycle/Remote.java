package com.springcore.beanlifecycle;

public class Remote {
    private String remoteName;

    public String getRemoteName() {
        return remoteName;
    }

    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName;
    }
    @PostConstruct
    public void start(){
        System.out.println("this is init method of remote");
    }
    @PreDestroy
    public void end(){
        System.out.println("this is destroy method of remote");
    }
    public Remote() {
    }

    @Override
    public String toString() {
        return "Remote{" +
                "remoteName='" + remoteName + '\'' +
                '}';
    }
}
