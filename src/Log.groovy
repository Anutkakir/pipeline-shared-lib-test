public class Log {
    private String color;
    private String type;
    private String message;

    public Log(String color, String type, String message) {
        this.color = color;
        this.type = type;
        this.message = message;

        ansiColor('xterm') {
            println "${color} * * * * [${type}] - ${message} \033[0m "
        }
    }

}