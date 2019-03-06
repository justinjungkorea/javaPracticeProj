package practicePackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calulation extends Frame implements ActionListener {
    Button[] btn = new Button[16]; //0-9,clear,+,-,*,/,=
    int sum = 0;
    int input = 0;

    Panel p;
    Panel textP;
    Label label;
    int flag;


    public calulation(String str) {
        super(str);

        p = new Panel();
        textP = new Panel();
        label = new Label("0",Label.RIGHT);
        label.setFont(new Font("Arial",Font.BOLD,50));
        flag = 0;

        this.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4, 4));
        btn[0] = new Button("0");
        btn[10] = new Button("clear");
        btn[11] = new Button("+");
        btn[12] = new Button("-");
        btn[13] = new Button("*");
        btn[14] = new Button("/");
        btn[15] = new Button("=");
        for (int i = 0; i < 16; ++i) {
            if (0 < i && i < 10) {
                btn[i] = new Button(i + "");
            }
            btn[i].addActionListener(this);
        }
        p.add(btn[1]);
        p.add(btn[2]);
        p.add(btn[3]);
        p.add(btn[12]);

        p.add(btn[4]);
        p.add(btn[5]);
        p.add(btn[6]);
        p.add(btn[13]);

        p.add(btn[7]);
        p.add(btn[8]);
        p.add(btn[9]);
        p.add(btn[14]);

        p.add(btn[10]);
        p.add(btn[0]);
        p.add(btn[11]);
        p.add(btn[15]);

        textP.add(label);
        this.add("North",label);
        this.add("Center",p);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;++i){
            if(e.getSource() == btn[i]){
                input = input * 10+i;
                label.setText(Integer.toString(input));
                return;
            }
        }
        if (e.getSource() == btn[10]) {
            input = 0;
            sum = 0;
            label.setText(Integer.toString(sum));
        } else if (e.getSource() == btn[11]) {
            cal();
            flag = 1;
        } else if (e.getSource() == btn[12]) {
            cal();
            flag = 2;
        } else if (e.getSource() == btn[13]) {
            cal();
            flag = 3;
        } else if (e.getSource() == btn[14]) {
            cal();
            flag = 4;
        } else if(e.getSource() == btn[15]){
            cal();
            flag=0;
        }
    }

    public void cal(){
        if(flag==0 || flag==1){
            sum += input;
        }
        else if(flag==2){
            sum-=input;
        }
        else if(flag==3){
            sum*=input;
        }
        else if(flag==4){
            if(input==0){
                label.setText("error! press 'clear'");
                return;
            }
            sum/=input;
        }
        input = 0;
        label.setText(Integer.toString(sum));
    }

}
