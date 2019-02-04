public class Test {

    public static void main(String[] args) {

        Television tv = new Television();

        tv.setOn_Off(true);
        tv.setChannel(100);
        tv.setVolume(5);

        tv.channelUp(); //101
        tv.channelDown(); //100
        tv.volumeUp(); //6
        tv.volumeUp(); //7
        tv.volumeDown(); //6
        tv.setOn_Off(false); // turn off tv

        System.out.println(tv.toString());

    }
}