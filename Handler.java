public interface Handler {
    public void process(String path);
    public void setNextHandler(Handler nextHandler);
    public void setName(String name);
    public String getName();
}
