public class TextHandler implements Handler {
    Handler nextHandler;
    String name;

    TextHandler() {
        this.nextHandler = null;
        this.name = null;
    }
    TextHandler(String name) {
        this.nextHandler = null;
        this.name = name;
    }

    @Override
    public void process(String path) {
        if(path.contains(".txt")) {
            System.out.println(this.name + " is processing " + path);
        } else if(nextHandler != null) {
            this.nextHandler.process(path);
        }else{
            System.out.println("No handler found for " + path);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getNextHandlerName() {
        return this.nextHandler.getName();
    }
    
}
