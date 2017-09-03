package com.profitbricks.sdk;

public class UserManagement {
    public UserManagement() throws Exception {
        this.group = new Group();
        this.share = new Share();
        this.user = new User();
        this.resource = new Resource();
    }

    private String credentials;
    private Group group;
    private Share share;
    private User user;
    private Resource resource;

    /**
     * @return the group
     */
    public Group getGroup() {
        this.group.setCredentials(credentials);
        return group;
    }

    public void setGroup(Group group) {
        this.group.setCredentials(credentials);
        this.group = group;
    }

    public Resource getResource() {
        this.resource.setCredentials(credentials);
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource.setCredentials(credentials);
        this.resource = resource;
    }

    public User getUser() {
        this.user.setCredentials(credentials);
        return user;
    }

    public void setUser(User user) {
        this.user.setCredentials(credentials);
        this.user = user;
    }

    public Share getShare() {
        this.share.setCredentials(credentials);
        return share;
    }

    public void setShare(Share share) {
        this.share.setCredentials(credentials);
        this.share = share;
    }

}
