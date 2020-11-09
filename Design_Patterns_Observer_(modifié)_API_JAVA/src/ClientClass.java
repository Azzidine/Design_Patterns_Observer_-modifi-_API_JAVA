public class ClientClass {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("###########################"
      		+ "le premier num�ro a changer est: 15"
      		+ "   ##############################");	
      subject.setState(15);
      System.out.println("#########################"
      		+ "le Second num�ro a  changer est: 10"
      		+ "    ############################");	
      subject.setState(10);
   }
}
