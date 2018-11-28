public class RibersShoutOut {

    int calledTimes;
    RibersShoutOut(int calledTimes) {
        this.calledTimes = calledTimes;

        for (int i = 0; i < this.calledTimes; i++) {
            System.out.println(i +1 + ".  WHAT UP G!!");
        }
    }

    public void swear() {

        for (int i = 0; i < this.calledTimes; i++) {

            System.out.print(i+1+ ". ");
            System.out.print("fuck, ");
            System.out.print("shit, ");
            System.out.println("cunt shit fuck");
        }
    }
}