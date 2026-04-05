public class helloappUC2 {

    public static void main(String[] args) {

        // Check if a name argument is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
        else {
            // Default message if no argument is provided
            System.out.println("Hello, World!");
        }

    }

}