import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.GroupLayout;


public class Tower2 extends JFrame {

  public Stack A;
  public Stack B;
  public Stack C;

  public int number;
  public int MAX = 8;

  public JPanel A0;
  public JPanel A1;
  public JPanel A2;
  public JPanel A3;
  public JPanel A4;
  public JPanel A5;
  public JPanel A6;
  public JPanel A7;

  public JPanel B0;
  public JPanel B1;
  public JPanel B2;
  public JPanel B3;
  public JPanel B4;
  public JPanel B5;
  public JPanel B6;
  public JPanel B7;

  public JPanel C0;
  public JPanel C1;
  public JPanel C2;
  public JPanel C3;
  public JPanel C4;
  public JPanel C5;
  public JPanel C6;
  public JPanel C7;

  public JLabel Tower1;
  public JLabel Tower2;
  public JLabel Tower3;
  public JButton jButton1;
  public JButton jButton2;
  public JButton jButton3;
  public JLabel jLabel1;
  public JTextField jTextField1;

  public Tower2() {
    initComponents();
    A0.setVisible(false);
    A1.setVisible(false);
    A2.setVisible(false);
    A3.setVisible(false);
    A4.setVisible(false);
    A5.setVisible(false);
    A6.setVisible(false);
    A7.setVisible(false);

    B0.setVisible(false);
    B1.setVisible(false);
    B2.setVisible(false);
    B3.setVisible(false);
    B4.setVisible(false);
    B5.setVisible(false);
    B6.setVisible(false);
    B7.setVisible(false);

    C0.setVisible(false);
    C1.setVisible(false);
    C2.setVisible(false);
    C3.setVisible(false);
    C4.setVisible(false);
    C5.setVisible(false);
    C6.setVisible(false);
    C7.setVisible(false);
  }


  private void initComponents() {
    jButton1 = new JButton();
    jButton2 = new JButton();
    jButton3 = new JButton();

    jLabel1 = new JLabel();
    jTextField1 = new JTextField();

    C7 = new JPanel();
    C6 = new JPanel();
    C5 = new JPanel();
    C4 = new JPanel();
    C3 = new JPanel();
    C2 = new JPanel();
    C1 = new JPanel();
    C0 = new JPanel();

    B7 = new JPanel();
    B6 = new JPanel();
    B5 = new JPanel();
    B4 = new JPanel();
    B3 = new JPanel();
    B2 = new JPanel();
    B1 = new JPanel();
    B0 = new JPanel();

    A7 = new JPanel();
    A6 = new JPanel();
    A5 = new JPanel();
    A4 = new JPanel();
    A3 = new JPanel();
    A2 = new JPanel();
    A1 = new JPanel();
    A0 = new JPanel();

    Tower1 = new JLabel();
    Tower2 = new JLabel();
    Tower3 = new JLabel();

    setSize(1150, 650);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);

    jButton1.setText("Exit");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    getContentPane().add(jButton1);
    jButton1.setBounds(1010, 560, 75, 29);

    jButton2.setText("Reset");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });
    getContentPane().add(jButton2);
    jButton2.setBounds(970, 10, 111, 20);

    jLabel1.setText("Number of Disks:");
    getContentPane().add(jLabel1);
    jLabel1.setBounds(30, 12, 120, 20);

    jTextField1.setText("Enter number of Disks");
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1ActionPerformed(evt);
      }
    });
    getContentPane().add(jTextField1);
    jTextField1.setBounds(140, 10, 155, 26);

    jButton3.setText("Solve");
    jButton3.addActionListener (new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });
    getContentPane().add(jButton3);
    jButton3.setBounds(500, 10, 77, 29);


    getContentPane().add(C7);
    getContentPane().add(C6);
    getContentPane().add(C5);
    getContentPane().add(C4);
    getContentPane().add(C3);
    getContentPane().add(C2);
    getContentPane().add(C1);
    getContentPane().add(C0);

    getContentPane().add(B7);
    getContentPane().add(B6);
    getContentPane().add(B5);
    getContentPane().add(B4);
    getContentPane().add(B3);
    getContentPane().add(B2);
    getContentPane().add(B1);
    getContentPane().add(B0);


    getContentPane().add(A7);
    getContentPane().add(A6);
    getContentPane().add(A5);
    getContentPane().add(A4);
    getContentPane().add(A3);
    getContentPane().add(A2);
    getContentPane().add(A1);
    getContentPane().add(A0);


    Tower1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Tower.png"))); // NOI18N
    Tower1.setText("Tower1");
    getContentPane().add(Tower1);
    Tower1.setBounds(10, 110, 350, 380);

    Tower2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Tower.png"))); // NOI18N
    Tower2.setText("Tower2");
    getContentPane().add(Tower2);
    Tower2.setBounds(380, 110, 350, 380);

    Tower3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Tower.png"))); // NOI18N
    Tower3.setText("Tower3");
    getContentPane().add(Tower3);
    Tower3.setBounds(750, 110, 350, 380);
  }

  private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    number = Integer.parseInt(jTextField1.getText());
    A=new Stack(number,'A');
    B=new Stack(number,'B');
    C=new Stack(number,'C');

      for(int i=0,j=A.cap;i<A.cap;i++,j--) {
        A.a[i]=j;
        A.last++;
        B.a[i]=0;
        C.a[i]=0;
      }

      updateAll();
      System.out.println(number);

  }

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt){
    new Thread(new Runnable(){
      @Override
      public void run(){
        //number = Integer.parseInt(jTextField1.getText());
        jTextField1.setText(Integer.toString(number));
        int step = move(number, A, B, C);
      }
    }).start();
  }

  public int move(int number, Stack from, Stack pass, Stack to){
    int step=0;
    if (number == 1){
      System.out.println("Disk 1 from "+ from.name + " to " + to.name);
      step++;
      if(to.push(from.peek())==true) {
        from.pop();
        this.updateAll();
        sleep();
      }
    }else{
      move(number - 1, from, to, pass);
      System.out.println("Disk "+ number + " from " + from.name + " to " + to.name);
      step++;
      if(to.push(from.peek())==true) {
        from.pop();
        this.updateAll();
        sleep();
      }
      move(number - 1, pass, from, to);
    }
    return step;
  }

  public static void sleep(){
    try{
      Thread.sleep(1000);
    } catch (Exception e){}
  }



  public void updateAll(){
    this.updateA();
    this.updateB();
    this.updateC();
  }

  public void updateA(){
    new Thread(new Runnable(){
      @Override
      public void run(){

        if(number>=1){
          if(A.a[0]==8){
            A0.setBackground(new java.awt.Color(133, 193, 233));
            A0.setBounds(45, 435, 280, 35);
            A0.setVisible(true);
          }else if(A.a[0]==7){
            A0.setBackground(new java.awt.Color(123, 125, 125));
            A0.setBounds(60, 435, 250, 35);
            A0.setVisible(true);
          }else if(A.a[0]==6){
            A0.setBackground(new java.awt.Color(243, 156, 18));
            A0.setBounds(75, 435, 220, 35);
            A0.setVisible(true);
          }else if(A.a[0]==5){
            A0.setBackground(new java.awt.Color(108, 52, 131));
            A0.setBounds(90, 435, 190, 35);
            A0.setVisible(true);
          }else if(A.a[0]==4){
            A0.setBackground(new java.awt.Color(30, 132, 73));
            A0.setBounds(105, 435, 160, 35);
            A0.setVisible(true);
          }else if(A.a[0]==3){
            A0.setBackground(new java.awt.Color(153, 255, 102));
            A0.setBounds(120, 435, 130, 35);
            A0.setVisible(true);
          } else if(A.a[0]==2){
            A0.setBackground(new java.awt.Color(102, 102, 255));
            A0.setBounds(135, 435, 100, 35);
            A0.setVisible(true);
          } else if(A.a[0]==1){
            A0.setBackground(new java.awt.Color(255, 51, 51));
            A0.setBounds(151, 435, 70, 35);
            A0.setVisible(true);
          } else
            A0.setVisible(false);
        }else{
          A0.setVisible(false);
        }

        if(number>=2){
          if(A.a[1]==7){
            A1.setBackground(new java.awt.Color(123, 125, 125));
            A1.setBounds(60, 400, 250, 35);
            A1.setVisible(true);
          }else if(A.a[1]==6){
            A1.setBackground(new java.awt.Color(243, 156, 18));
            A1.setBounds(75, 400, 220, 35);
            A1.setVisible(true);
          }else if(A.a[1]==5){
            A1.setBackground(new java.awt.Color(108, 52, 131));
            A1.setBounds(90, 400, 190, 35);
            A1.setVisible(true);
          }else if(A.a[1]==4){
            A1.setBackground(new java.awt.Color(30, 132, 73));
            A1.setBounds(105, 400, 160, 35);
            A1.setVisible(true);
          }else if(A.a[1]==3){
            A1.setBackground(new java.awt.Color(153, 255, 102));
            A1.setBounds(120, 400, 130, 35);
            A1.setVisible(true);
          } else if(A.a[1]==2){
            A1.setBackground(new java.awt.Color(102, 102, 255));
            A1.setBounds(135, 400, 100, 35);
            A1.setVisible(true);
          } else if(A.a[1]==1){
            A1.setBackground(new java.awt.Color(255, 51, 51));
            A1.setBounds(151, 400, 70, 35);
            A1.setVisible(true);
          } else{
            A1.setVisible(false);
          }
        }else{
          A1.setVisible(false);
        }

        if(number>=3){
          if(A.a[2]==6){
            A2.setBackground(new java.awt.Color(243, 156, 18));
            A2.setBounds(75, 365, 220, 35);
            A2.setVisible(true);
          }else if(A.a[2]==5){
            A2.setBackground(new java.awt.Color(108, 52, 131));
            A2.setBounds(90, 365, 190, 35);
            A2.setVisible(true);
          }else if(A.a[2]==4){
            A2.setBackground(new java.awt.Color(30, 132, 73));
            A2.setBounds(105, 365, 160, 35);
            A2.setVisible(true);
          }else if(A.a[2]==3){
            A2.setBackground(new java.awt.Color(153, 255, 102));
            A2.setBounds(120, 365, 130, 35);
            A2.setVisible(true);
          } else if(A.a[2]==2){
            A2.setBackground(new java.awt.Color(102, 102, 255));
            A2.setBounds(135, 365, 100, 35);
            A2.setVisible(true);
          } else if(A.a[2]==1){
            A2.setBackground(new java.awt.Color(255, 51, 51));
            A2.setBounds(151, 365, 70, 35);
            A2.setVisible(true);
          } else{
            A2.setVisible(false);
          }
        }else{
          A2.setVisible(false);
        }

        if(number>=4){
          if(A.a[3]==5){
            A3.setBackground(new java.awt.Color(108, 52, 131));
            A3.setBounds(90, 330, 190, 35);
            A3.setVisible(true);
          }else if(A.a[3]==4){
            A3.setBackground(new java.awt.Color(30, 132, 73));
            A3.setBounds(105, 330, 160, 35);
            A3.setVisible(true);
          }else if(A.a[3]==3){
            A3.setBackground(new java.awt.Color(153, 255, 102));
            A3.setBounds(120, 330, 130, 35);
            A3.setVisible(true);
          } else if(A.a[3]==2){
            A3.setBackground(new java.awt.Color(102, 102, 255));
            A3.setBounds(135, 330, 100, 35);
            A3.setVisible(true);
          } else if(A.a[3]==1){
            A3.setBackground(new java.awt.Color(255, 51, 51));
            A3.setBounds(151, 330, 70, 35);
            A3.setVisible(true);
          } else{
            A3.setVisible(false);
          }
        }else{
          A3.setVisible(false);
        }

        if(number>=5){
          if(A.a[4]==4){
            A4.setBackground(new java.awt.Color(30, 132, 73));
            A4.setBounds(105, 295, 160, 35);
            A4.setVisible(true);
          }else if(A.a[4]==3){
            A4.setBackground(new java.awt.Color(153, 255, 102));
            A4.setBounds(120, 295, 130, 35);
            A4.setVisible(true);
          } else if(A.a[4]==2){
            A4.setBackground(new java.awt.Color(102, 102, 255));
            A4.setBounds(135, 295, 100, 35);
            A4.setVisible(true);
          } else if(A.a[4]==1){
            A4.setBackground(new java.awt.Color(255, 51, 51));
            A4.setBounds(151, 295, 70, 35);
            A4.setVisible(true);
          } else{
            A4.setVisible(false);
          }
        }else{
          A4.setVisible(false);
        }

        if(number>=6){
          if(A.a[5]==3){
            A5.setBackground(new java.awt.Color(153, 255, 102));
            A5.setBounds(120, 260, 130, 35);
            A5.setVisible(true);
          } else if(A.a[5]==2){
            A5.setBackground(new java.awt.Color(102, 102, 255));
            A5.setBounds(135, 260, 100, 35);
            A5.setVisible(true);
          } else if(A.a[5]==1){
            A5.setBackground(new java.awt.Color(255, 51, 51));
            A5.setBounds(151, 260, 70, 35);
            A5.setVisible(true);
          } else{
            A5.setVisible(false);
          }
        }else{
          A5.setVisible(false);
        }

        if(number>=7){
          if(A.a[6]==2){
            A6.setBackground(new java.awt.Color(102, 102, 255));
            A6.setBounds(135, 225, 100, 35);
            A6.setVisible(true);
          } else if(A.a[6]==1){
            A6.setBackground(new java.awt.Color(255, 51, 51));
            A6.setBounds(151, 225, 70, 35);
            A6.setVisible(true);
          } else{
            A6.setVisible(false);
          }
        }else{
          A6.setVisible(false);
        }

        if(number>=8){
          if(A.a[7]==1){
            A7.setBackground(new java.awt.Color(255, 51, 51));
            A7.setBounds(151, 190, 70, 35);
            A7.setVisible(true);
          } else{
            A7.setVisible(false);
          }
        }else{
          A7.setVisible(false);
        }

      }
    }).start();
  }


  public void updateB(){
    if(number>=1){
      if(B.a[0]==8){
        B0.setBackground(new java.awt.Color(133, 193, 233));
        B0.setBounds(415, 435, 280, 35);
        B0.setVisible(true);
      }else if(B.a[0]==7){
        B0.setBackground(new java.awt.Color(123, 125, 125));
        B0.setBounds(430, 435, 250, 35);
        B0.setVisible(true);
      }else if(B.a[0]==6){
        B0.setBackground(new java.awt.Color(243, 156, 18));
        B0.setBounds(445, 435, 220, 35);
        B0.setVisible(true);
      }else if(B.a[0]==5){
        B0.setBackground(new java.awt.Color(108, 52, 131));
        B0.setBounds(460, 435, 190, 35);
        B0.setVisible(true);
      }else if(B.a[0]==4){
        B0.setBackground(new java.awt.Color(30, 132, 73));
        B0.setBounds(475, 435, 160, 35);
        B0.setVisible(true);
      }else if(B.a[0]==3){
        B0.setBackground(new java.awt.Color(153, 255, 102));
        B0.setBounds(490, 435, 130, 35);
        B0.setVisible(true);
      } else if(B.a[0]==2){
        B0.setBackground(new java.awt.Color(102, 102, 255));
        B0.setBounds(505, 435, 100, 35);
        B0.setVisible(true);
      } else if(B.a[0]==1){
        B0.setBackground(new java.awt.Color(255, 51, 51));
        B0.setBounds(521, 435, 70, 35);
        B0.setVisible(true);
      } else{
        B0.setVisible(false);
      }
    }else{
      B0.setVisible(false);
    }


    if(number>=2){
      if(B.a[1]==7){
        B1.setBackground(new java.awt.Color(123, 125, 125));
        B1.setBounds(430, 400, 250, 35);
        B1.setVisible(true);
      }else if(B.a[1]==6){
        B1.setBackground(new java.awt.Color(243, 156, 18));
        B1.setBounds(445, 400, 220, 35);
        B1.setVisible(true);
      }else if(B.a[1]==5){
        B1.setBackground(new java.awt.Color(108, 52, 131));
        B1.setBounds(460, 400, 190, 35);
        B1.setVisible(true);
      }else if(B.a[1]==4){
        B1.setBackground(new java.awt.Color(30, 132, 73));
        B1.setBounds(475, 400, 160, 35);
        B1.setVisible(true);
      }else if(B.a[1]==3){
        B1.setBackground(new java.awt.Color(153, 255, 102));
        B1.setBounds(490, 400, 130, 35);
        B1.setVisible(true);
      } else if(B.a[1]==2){
        B1.setBackground(new java.awt.Color(102, 102, 255));
        B1.setBounds(505, 400, 100, 35);
        B1.setVisible(true);
      } else if(B.a[1]==1){
        B1.setBackground(new java.awt.Color(255, 51, 51));
        B1.setBounds(521, 400, 70, 35);
        B1.setVisible(true);
      } else{
        B1.setVisible(false);
      }
    }else{
      B1.setVisible(false);
    }

    if(number>=3){
      if(B.a[2]==6){
        B2.setBackground(new java.awt.Color(243, 156, 18));
        B2.setBounds(445, 365, 220, 35);
        B2.setVisible(true);
      }else if(B.a[2]==5){
        B2.setBackground(new java.awt.Color(108, 52, 131));
        B2.setBounds(460, 365, 190, 35);
        B2.setVisible(true);
      }else if(B.a[2]==4){
        B2.setBackground(new java.awt.Color(30, 132, 73));
        B2.setBounds(475, 365, 160, 35);
        B2.setVisible(true);
      }else if(B.a[2]==3){
        B2.setBackground(new java.awt.Color(153, 255, 102));
        B2.setBounds(490, 365, 130, 35);
        B2.setVisible(true);
      } else if(B.a[2]==2){
        B2.setBackground(new java.awt.Color(102, 102, 255));
        B2.setBounds(505, 365, 100, 35);
        B2.setVisible(true);
      } else if(B.a[2]==1){
        B2.setBackground(new java.awt.Color(255, 51, 51));
        B2.setBounds(521, 365, 70, 35);
        B2.setVisible(true);
      } else{
        B2.setVisible(false);
      }
    } else{
      B2.setVisible(false);
    }


    if(number>=4){
      if(B.a[3]==5){
        B3.setBackground(new java.awt.Color(108, 52, 131));
        B3.setBounds(460, 330, 190, 35);
        B3.setVisible(true);
      }else if(B.a[3]==4){
        B3.setBackground(new java.awt.Color(30, 132, 73));
        B3.setBounds(475, 330, 160, 35);
        B3.setVisible(true);
      }else if(B.a[3]==3){
        B3.setBackground(new java.awt.Color(153, 255, 102));
        B3.setBounds(490, 330, 130, 35);
        B3.setVisible(true);
      } else if(B.a[3]==2){
        B3.setBackground(new java.awt.Color(102, 102, 255));
        B3.setBounds(505, 330, 100, 35);
        B3.setVisible(true);
      } else if(B.a[3]==1){
        B3.setBackground(new java.awt.Color(255, 51, 51));
        B3.setBounds(521, 330, 70, 35);
        B3.setVisible(true);
      } else{
        B3.setVisible(false);
      }
    }else{
      B3.setVisible(false);
    }

    if(number>=5){
      if(B.a[4]==4){
        B4.setBackground(new java.awt.Color(30, 132, 73));
        B4.setBounds(475, 295, 160, 35);
        B4.setVisible(true);
      }else if(B.a[4]==3){
        B4.setBackground(new java.awt.Color(153, 255, 102));
        B4.setBounds(490, 295, 130, 35);
        B4.setVisible(true);
      } else if(B.a[4]==2){
        B4.setBackground(new java.awt.Color(102, 102, 255));
        B4.setBounds(505, 295, 100, 35);
        B4.setVisible(true);
      } else if(B.a[4]==1){
        B4.setBackground(new java.awt.Color(255, 51, 51));
        B4.setBounds(521, 295, 70, 35);
        B4.setVisible(true);
      } else{
        B4.setVisible(false);
      }
    }else{
      B4.setVisible(false);
    }

    if(number>=6){
      if(B.a[5]==3){
        B5.setBackground(new java.awt.Color(153, 255, 102));
        B5.setBounds(490, 260, 130, 35);
        B5.setVisible(true);
      } else if(B.a[5]==2){
        B5.setBackground(new java.awt.Color(102, 102, 255));
        B5.setBounds(505, 260, 100, 35);
        B5.setVisible(true);
      } else if(B.a[5]==1){
        B5.setBackground(new java.awt.Color(255, 51, 51));
        B5.setBounds(521, 260, 70, 35);
        B5.setVisible(true);
      } else{
        B5.setVisible(false);
      }
    }else{
      B5.setVisible(false);
    }

    if(number>=7){
      if(B.a[6]==2){
        B6.setBackground(new java.awt.Color(102, 102, 255));
        B6.setBounds(505, 225, 100, 35);
        B6.setVisible(true);
      } else if(B.a[6]==1){
        B6.setBackground(new java.awt.Color(255, 51, 51));
        B6.setBounds(521, 225, 70, 35);
        B6.setVisible(true);
      } else{
        B6.setVisible(false);
      }
    }else{
      B6.setVisible(false);
    }

    if(number>=8){
      if(B.a[7]==1){
        B7.setBackground(new java.awt.Color(255, 51, 51));
        B7.setBounds(521, 190, 70, 35);
        B7.setVisible(true);
      } else{
        B7.setVisible(false);
      }
    }else{
      B7.setVisible(false);
    }
  }

  public void updateC(){
    if(number>=1){
      if(C.a[0]==8){
        C0.setBackground(new java.awt.Color(133, 193, 233));
        C0.setBounds(785, 435, 280, 35);
        C0.setVisible(true);
      }else if(C.a[0]==7){
        C0.setBackground(new java.awt.Color(123, 125, 125));
        C0.setBounds(800, 435, 250, 35);
        C0.setVisible(true);
      }else if(C.a[0]==6){
        C0.setBackground(new java.awt.Color(243, 156, 18));
        C0.setBounds(815, 435, 220, 35);
        C0.setVisible(true);
      }else if(C.a[0]==5){
        C0.setBackground(new java.awt.Color(108, 52, 131));
        C0.setBounds(830, 435, 190, 35);
        C0.setVisible(true);
      }else if(C.a[0]==4){
        C0.setBackground(new java.awt.Color(30, 132, 73));
        C0.setBounds(845, 435, 160, 35);
        C0.setVisible(true);
      }else if(C.a[0]==3){
        C0.setBackground(new java.awt.Color(153, 255, 102));
        C0.setBounds(860, 435, 130, 35);
        C0.setVisible(true);
      }else if(C.a[0]==2){
        C0.setBackground(new java.awt.Color(102, 102, 255));
        C0.setBounds(875, 435, 100, 35);
        C0.setVisible(true);
      }else if(C.a[0]==1){
        C0.setBackground(new java.awt.Color(255, 51, 51));
        C0.setBounds(890, 435, 70, 35);
        C0.setVisible(true);
      }else{
        C0.setVisible(false);
      }
    }else{
      C0.setVisible(false);
    }

    if(number>=2){
      if(C.a[1]==7){
        C1.setBackground(new java.awt.Color(123, 125, 125));
        C1.setBounds(800, 400, 250, 35);
        C1.setVisible(true);
      }else if(C.a[1]==6){
        C1.setBackground(new java.awt.Color(243, 156, 18));
        C1.setBounds(815, 400, 220, 35);
        C1.setVisible(true);
      }else if(C.a[1]==5){
        C1.setBackground(new java.awt.Color(108, 52, 131));
        C1.setBounds(830, 400, 190, 35);
        C1.setVisible(true);
      }else if(C.a[1]==4){
        C1.setBackground(new java.awt.Color(30, 132, 73));
        C1.setBounds(845, 400, 160, 35);
        C1.setVisible(true);
      }else if(C.a[1]==3){
        C1.setBackground(new java.awt.Color(153, 255, 102));
        C1.setBounds(860, 400, 130, 35);
        C1.setVisible(true);
      }else if(C.a[1]==2){
        C1.setBackground(new java.awt.Color(102, 102, 255));
        C1.setBounds(875, 400, 100, 35);
        C1.setVisible(true);
      }else if(C.a[1]==1){
        C1.setBackground(new java.awt.Color(255, 51, 51));
        C1.setBounds(890, 400, 70, 35);
        C1.setVisible(true);
      }else{
        C1.setVisible(false);
      }
    }else{
      C1.setVisible(false);
    }

    if(number>=3){
      if(C.a[2]==6){
        C2.setBackground(new java.awt.Color(243, 156, 18));
        C2.setBounds(815, 365, 220, 35);
        C2.setVisible(true);
      }else if(C.a[2]==5){
        C2.setBackground(new java.awt.Color(108, 52, 131));
        C2.setBounds(830, 365, 190, 35);
        C2.setVisible(true);
      }else if(C.a[2]==4){
        C2.setBackground(new java.awt.Color(30, 132, 73));
        C2.setBounds(845, 365, 160, 35);
        C2.setVisible(true);
      }else if(C.a[2]==3){
        C2.setBackground(new java.awt.Color(153, 255, 102));
        C2.setBounds(860, 365, 130, 35);
        C2.setVisible(true);
      }else if(C.a[2]==2){
        C2.setBackground(new java.awt.Color(102, 102, 255));
        C2.setBounds(875, 365, 100, 35);
        C2.setVisible(true);
      }else if(C.a[2]==1){
        C2.setBackground(new java.awt.Color(255, 51, 51));
        C2.setBounds(890, 365, 70, 35);
        C2.setVisible(true);
      }else{
        C2.setVisible(false);
      }
    }else{
      C2.setVisible(false);
    }

    if(number>=4){
      if(C.a[3]==5){
        C3.setBackground(new java.awt.Color(108, 52, 131));
        C3.setBounds(830, 330, 190, 35);
        C3.setVisible(true);
      }else if(C.a[3]==4){
        C3.setBackground(new java.awt.Color(30, 132, 73));
        C3.setBounds(845, 330, 160, 35);
        C3.setVisible(true);
      }else if(C.a[3]==3){
        C3.setBackground(new java.awt.Color(153, 255, 102));
        C3.setBounds(860, 330, 130, 35);
        C3.setVisible(true);
      }else if(C.a[3]==2){
        C3.setBackground(new java.awt.Color(102, 102, 255));
        C3.setBounds(875, 330, 100, 35);
        C3.setVisible(true);
      }else if(C.a[3]==1){
        C3.setBackground(new java.awt.Color(255, 51, 51));
        C3.setBounds(890, 330, 70, 35);
        C3.setVisible(true);
      }else{
        C3.setVisible(false);
      }
    }else{
      C3.setVisible(false);
    }

    if(number>=5){
      if(C.a[4]==4){
        C4.setBackground(new java.awt.Color(30, 132, 73));
        C4.setBounds(845, 295, 160, 35);
        C4.setVisible(true);
      }else if(C.a[4]==3){
        C4.setBackground(new java.awt.Color(153, 255, 102));
        C4.setBounds(860, 295, 130, 35);
        C4.setVisible(true);
      }else if(C.a[4]==2){
        C4.setBackground(new java.awt.Color(102, 102, 255));
        C4.setBounds(875, 295, 100, 35);
        C4.setVisible(true);
      }else if(C.a[4]==1){
        C4.setBackground(new java.awt.Color(255, 51, 51));
        C4.setBounds(890, 295, 70, 35);
        C4.setVisible(true);
      }else{
        C4.setVisible(false);
      }
    }else{
      C4.setVisible(false);
    }

    if(number>=6){
      if(C.a[5]==3){
        C5.setBackground(new java.awt.Color(153, 255, 102));
        C5.setBounds(860, 260, 130, 35);
        C5.setVisible(true);
      }else if(C.a[5]==2){
        C5.setBackground(new java.awt.Color(102, 102, 255));
        C5.setBounds(875, 260, 100, 35);
        C5.setVisible(true);
      }else if(C.a[5]==1){
        C5.setBackground(new java.awt.Color(255, 51, 51));
        C5.setBounds(890, 260, 70, 35);
        C5.setVisible(true);
      }else{
        C5.setVisible(false);
      }
    }else{
      C5.setVisible(false);
    }

    if(number>=7){
      if(C.a[6]==2){
        C6.setBackground(new java.awt.Color(102, 102, 255));
        C6.setBounds(875, 225, 100, 35);
        C6.setVisible(true);
      }else if(C.a[6]==1){
        C6.setBackground(new java.awt.Color(255, 51, 51));
        C6.setBounds(890, 225, 70, 35);
        C6.setVisible(true);
      }else{
        C6.setVisible(false);
      }
    }else{
      C6.setVisible(false);
    }

    if(number>=8){
      if(C.a[7]==1){
        C7.setBackground(new java.awt.Color(255, 51, 51));
        C7.setBounds(890, 190, 70, 35);
        C7.setVisible(true);
      }else{
        C7.setVisible(false);
      }
    }else{
      C7.setVisible(false);
    }

  }


  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    System.exit(0);
  }

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    number = 1;
    A=new Stack(number,'A');
    B=new Stack(number,'B');
    C=new Stack(number,'C');

    for(int i=0,j=A.cap;i<A.cap;i++,j--) {
      A.a[i]=j;
      A.last++;
      B.a[i]=0;
      C.a[i]=0;
    }

    jTextField1.setText("1");
    updateAll();
  }

  public static void main(String args[]) {
    Tower2 gui = new Tower2();
    gui.setVisible(true);

  }

}
