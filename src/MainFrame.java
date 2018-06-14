import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        init();
    }
    private JTextField jtf=new JTextField();
    private JLabel jlb=new JLabel();
    private JButton jbn=new JButton("RUN");

    private void init(){
        this.setBounds(0,0,600,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        this.add(jtf);
        jtf.setBounds(0,0,200,200);

        this.add(jlb);
        jlb.setBounds(400,0,200,200);

        this.add(jbn);
        jbn.setBounds(200,0,200,200);
        jbn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double km=Float.parseFloat(jtf.getText());
                    double mi=km*0.6;
                    jlb.setText(String.valueOf(mi));
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(MainFrame.this,"???");
                }
            }
        });


    }
}
