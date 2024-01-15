public class Console {

    private boolean isDisplayed;

    public Console(){};
    public void display1(boolean display)
    {
        if(display)
        {
            System.out.print("Niech pierwszy gracz postawi krzyżyk\n");
        }
    }

    public void display2(boolean display)
    {
        if(display)
        {
            System.out.print("Niech drugi gracz postawi kółko\n");
        }
    }
}

//System.out.print("Witajcie w grze kółko i krzyżyk!/n");