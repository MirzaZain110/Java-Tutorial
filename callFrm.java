import java.awt.*;  
import java.awt.event.*;  
class prg1 extends Frame implements ActionListener  
{  
    MenuBar mb;  
    MenuItem mi1, mi2;  
    Menu m1;  
    Label l1, l2;  
    public prg1()  
    {  
        setLayout(new FlowLayout());  
        mb = new MenuBar();  
        m1 = new Menu("Frame");  
        mb.add(m1);  
        mi1 = new MenuItem("Frame1");  
        m1.add(mi1);  
        mi2 = new MenuItem("Frame2");  
        m1.add(mi2);  
        l1 = new Label("To Fill personal perticulars go to Frame1");  
        l2 = new Label("To fill general perticulars go to Frame2");  
        add(l1);  
        add(l2);  
        mi1.addActionListener(this);  
        mi2.addActionListener(this);  
        setMenuBar(mb);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == mi1)  
        {  
            prg2 p = new prg2();  
            p.setSize(300, 300);  
            p.setVisible(true);  
        }  
        if (e.getSource() == mi2)  
        {  
            prg3 p1 = new prg3();  
            p1.setSize(300, 300);  
            p1.setVisible(true);  
        }  
    }  
}  
class prg2 extends Frame implements WindowListener  
{  
    Label l, b1, b2, b3, b4, b5;  
    TextField t1, t2, t3, t4, t5;  
    public prg2()  
    {  
        setLayout(new FlowLayout());  
        l = new Label("this is frame 1");  
        b1 = new Label("First Name");  
        b2 = new Label("Last Name");  
        b3 = new Label("Father's Name");  
        b4 = new Label("Date of Birth");  
        b5 = new Label("Qualification");  
        t1 = new TextField(20);  
        t2 = new TextField(20);  
        t3 = new TextField(20);  
        t4 = new TextField(20);  
        t5 = new TextField(20);  
        add(l);  
        add(b1);  
        add(t1);  
        add(b2);  
        add(t2);  
        add(b3);  
        add(t3);  
        add(b4);  
        add(t4);  
        add(b5);  
        add(t5);  
        addWindowListener(this);  
    }  
    public void windowActivated(WindowEvent e)  
    {  
    }  
    public void windowDeactivated(WindowEvent e)  
    {  
    }  
    public void windowOpened(WindowEvent e)  
    {  
    }  
    public void windowClosed(WindowEvent e)  
    {  
    }  
    public void windowClosing(WindowEvent e)  
    {  
        setVisible(false);  
    }  
    public void windowIconified(WindowEvent e)  
    {  
    }  
    public void windowDeiconified(WindowEvent e)  
    {  
    }  
}  
class prg3 extends Frame implements WindowListener  
{  
    Label l, b1, b2, b3, b4;  
    TextField t1, t2, t3, t4;  
    public prg3()  
    {  
        setLayout(new FlowLayout());  
        l = new Label("this is frame 2");  
        b1 = new Label("Sports");  
        b2 = new Label("Hobbies");  
        b3 = new Label("Arts");  
        b4 = new Label("Other Intrests");  
        t1 = new TextField(20);  
        t2 = new TextField(20);  
        t3 = new TextField(20);  
        t4 = new TextField(20);  
        add(l);  
        add(b1);  
        add(t1);  
        add(b2);  
        add(t2);  
        add(b3);  
        add(t3);  
        add(b4);  
        add(t4);  
        addWindowListener(this);  
    }  
    public void windowActivated(WindowEvent e)  
    {  
    }  
    public void windowDeactivated(WindowEvent e)  
    {  
    }  
    public void windowOpened(WindowEvent e)  
    {  
    }  
    public void windowClosed(WindowEvent e)  
    {  
    }  
    public void windowClosing(WindowEvent e)  
    {  
        setVisible(false);  
    }  
    public void windowIconified(WindowEvent e)  
    {  
    }  
    public void windowDeiconified(WindowEvent e)  
    {  
    }  
}  
class callFrm  
{  
    public static void main(String arg[])  
    {  
        prg1 p = new prg1();  
        p.setSize(300, 300);  
        p.setVisible(true);  
    }  
} 