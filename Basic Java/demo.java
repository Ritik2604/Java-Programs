

import java.awt.*;
import java.awt.event.*;

class demo extends Frame implements ActionListener {

    TextField ta;
    Panel p;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    String value = "";
    float total = 0;

    demo() {

        p = new Panel();
        ta = new TextField(15);
        setLayout(new BorderLayout());
        add(ta, BorderLayout.NORTH);

        p.setLayout(new GridLayout(4, 5));

        b2 = new Button("OFF");
        p.add(b2);
        b2.addActionListener(this);
        for (int i = 7; i < 10; i++) {
            b1 = new Button("" + i);
            b1.addActionListener(this);
            p.add(b1);
        }
        b3 = new Button("+");
        p.add(b3);
        b3.addActionListener(this);

        b4 = new Button("sqrt");
        p.add(b4);
        b4.addActionListener(this);
        for (int i = 4; i < 7; i++) {
            b1 = new Button("" + i);
            b1.addActionListener(this);
            p.add(b1);
        }
        b5 = new Button("-");
        p.add(b5);
        b5.addActionListener(this);

        b6 = new Button("CE");
        p.add(b6);
        b6.addActionListener(this);
        for (int i = 1; i < 4; i++) {
            b1 = new Button("" + i);
            b1.addActionListener(this);
            p.add(b1);
        }
        b7 = new Button("*");
        p.add(b7);
        b7.addActionListener(this);

        b8 = new Button("00");
        p.add(b8);
        b8.addActionListener(this);

        b9 = new Button("0");
        b9.addActionListener(this);
        p.add(b9);
        b10 = new Button(".");
        p.add(b10);
        b10.addActionListener(this);
        b11 = new Button("=");
        p.add(b11);
        b11.addActionListener(this);
        b12 = new Button("/");
        p.add(b12);
        b12.addActionListener(this);

        add(p, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent ae) {
        try {

            if (ae.getActionCommand().equals("OFF")) {
                System.exit(0);
            }
            for (int i = 0; i < 10; i++) {
                if (ae.getActionCommand().equals("" + i)) {
                    value = value + i;
                }
            }
            if (ae.getActionCommand().equals("00")) {
                value += "00";
            }
            if (ae.getActionCommand().equals("CE")) {
                value = "";
                total = 0;
            }
            if (ae.getActionCommand().equals(".")) {
                value += ".";
            }
            if (ae.getActionCommand().equals("sqrt")) {
                int a = Integer.parseInt(value);
                value = "" + Math.sqrt(a);
            }
            if (ae.getActionCommand().equals("+")) {
                value += "+";
                float val1 = Float.parseFloat(value.substring(0, value.indexOf("+")));
                total += val1;

            }
            if (ae.getActionCommand().equals("-")) {
                value += "-";
                float val1 = Float.parseFloat(value.substring(0, value.indexOf("-")));
                total += val1;
            }
            if (ae.getActionCommand().equals("*")) {
                value += "*";
                float val1 = Float.parseFloat(value.substring(0, value.indexOf("*")));
                total += val1;
            }
            if (ae.getActionCommand().equals("/")) {
                value += "/";
                float val1 = Float.parseFloat(value.substring(0, value.indexOf("/")));
                total += val1;
            }
            if (ae.getActionCommand().equals("=")) {
                if (value.indexOf("+") > 0) {
                    float val2 = Float.parseFloat(value.substring((value.indexOf("+") + 1), value.length()));
                    total += val2;
                    value = "" + total;
                }

                if (value.indexOf("-") > 0) {
                    float val2 = Float.parseFloat(value.substring((value.indexOf("-") + 1), value.length()));
                    total -= val2;
                    value = "" + total;
                }

                if (value.indexOf("*") > 0) {
                    float val2 = Float.parseFloat(value.substring((value.indexOf("*") + 1), value.length()));
                    total *= val2;
                    value = "" + total;
                }

                if (value.indexOf("/") > 0) {
                    float val2 = Float.parseFloat(value.substring((value.indexOf("/") + 1), value.length()));
                    total /= val2;
                    value = "" + total;
                }

            }

            ta.setText(value);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String arg[]) throws Exception {
        demo d = new demo();
        d.setSize(500, 500);
        d.setVisible(true);
    }
}
