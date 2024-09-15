public class ZipHandler implements Handler {
    Handler nextHandler;
    String name;

    ZipHandler() {
        this.nextHandler = null;
        this.name = null;
    }
    ZipHandler(String name) {
        this.nextHandler = null;
        this.name = name;
    }

    @Override
    public void process(String path) {
        if(path.contains(".zip")) {
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
