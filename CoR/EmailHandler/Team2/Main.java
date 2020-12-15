import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        String path = System.getProperty("user.dir");
        FileReader fr = new FileReader(path + "/" + args[0]);
        BufferedReader br = new BufferedReader(fr);



        FilterChain filterChain = new FilterChain();
        EmailHandler emailHandler = new EmailHandler(filterChain);
        emailHandler.filterChain.addFilter(new SpamBoxFilter());
        emailHandler.filterChain.addFilter(new LegalDepartmentFilter());
        emailHandler.filterChain.addFilter(new CEOFilter());
        
        Email email = new Email();
        String inputLine;
        while ((inputLine = br.readLine()) != null) {
            String[] inputs = inputLine.trim().split(" ");
            String command = inputs[0];
            // check email type
            if ("SPAM".equals(command)) {
                email.setMyType(command);
            } else if ("COMPLAINT".equals(command)) {
                email.setMyType(command);
            } else if ("FAN".equals(command)) {
                email.setMyType(command);
            } else {
                System.out.println("Input Error");
            }
            // handle this email
            emailHandler.handle(email);
            emailHandler.filterChain.setPos(0);
        }
    }
}