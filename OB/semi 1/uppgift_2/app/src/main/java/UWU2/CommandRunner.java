package UWU2;

import java.util.Scanner;

public class CommandRunner {

    public static void run(Database db, PaymentSystem ps) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Command cmd = CommandParser.parse(line);
            if (cmd != null) {
                cmd.execute(db, ps);
            }
        }
    }
}