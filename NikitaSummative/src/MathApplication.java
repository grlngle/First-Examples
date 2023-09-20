
//As always, I import all of the nessecary packages that I will use within the program. 
//These are used to solve various problems, such as using color, setting the program in the middle of the screen, adding a timer to certain variables, and more!
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.Timer;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MathApplication extends javax.swing.JFrame {

        
    /*
     * Here, set up my "Random" (which I use later in my code), and I declare many of the variables that I use throughout the code.
     * The variables' function include storing questions, answers, fake answers, the amount of questions, and for disabling buttons (the others are self explanatory, but this one is "regulator")
     */
    
    Random rand = new Random();
    ArrayList<String> questions = new ArrayList();
    ArrayList<Integer> answers = new ArrayList(); 
    int regulator = 0;
    int parser;
    int answer;
    int questionCounter;
    int questionAmount;
    int correct;
    int indicate = 0;
    int fake;
    int fake2;
    int fake3;
    
    
    

    /*
     * The next chunk of code is my constructor. In addition to the automatically generated code, I have added some things.
     * There, I use the Dimension package in order to get the size of the screen, and then set the Jframe, as well as all of the Dialog's to appear in the middle of the screen.
     * I also set every "page" of my program to not be resizable, and I additionally set the text for one of my labels (the one in "About Us")
     */
    
    public MathApplication() {
        initComponents();
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x,y);
        testSelector.setLocation(x,y);
        writtenTest.setLocation(x,y);
        multipleChoice.setLocation(x,y);
        results.setLocation(x,y);
        calculator.setLocation(x,y);
        this.setResizable(false);
        testSelector.setResizable(false);
        writtenTest.setResizable(false);
        multipleChoice.setResizable(false);
        results.setResizable(false);
        calculator.setResizable(false);
        aboutUs.setText("<html> V-enterprises, the minds behind the legendary \"Kringle's Cafe \", have made it their mission to help young students everywhere. We want to help Grade 3 students with their math marks, so we have carefully crafted this learning program. Feel free to take the time to learn lessons, take the different exams and aim for the highest scores. Just don't rely too much on the calculator! Oh, and thank you for using our program!");
    }

    /*
     * Below here is the auto-generated code. It had been left mostly untouched by me. 
     * However, there are a few exceptions to the above statement, such as adding Window Adapters to the jDialogs, in order to detect their closing. When this happens, they stop running the program by using System.exit(1);
     * Please skip to Line 1287 if you wish to continue seeing the non-automatic code.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testSelector = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        written = new javax.swing.JButton();
        multiple = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        writtenTest = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        submitAnswer = new javax.swing.JButton();
        activateCalc1 = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        multipleChoice = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        selector2 = new javax.swing.JButton();
        selector1 = new javax.swing.JButton();
        selector4 = new javax.swing.JButton();
        selector3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        question2 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        activateCalc2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        calculator = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        jAnswer = new javax.swing.JLabel();
        results = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        finalScore = new javax.swing.JLabel();
        finalGrade = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        goBack1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        start = new javax.swing.JButton();
        enableCalculator = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        errorMesg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        indicator = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        aboutUs = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();

        testSelector.setMinimumSize(new java.awt.Dimension(1017, 720));

        jPanel16.setBackground(new java.awt.Color(0, 204, 204));

        written.setFont(new java.awt.Font("Knewave", 0, 18)); // NOI18N
        written.setText("Short Answer");
        written.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writtenActionPerformed(evt);
            }
        });

        multiple.setFont(new java.awt.Font("Knewave", 0, 18)); // NOI18N
        multiple.setText("Mulitple Choice");
        multiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rogue Hero 3D", 2, 44)); // NOI18N
        jLabel5.setText("What kind of test would you like?");

        jLabel6.setFont(new java.awt.Font("Rogue Hero 3D", 0, 24)); // NOI18N
        jLabel6.setText("Write in your answer...");

        jLabel7.setFont(new java.awt.Font("Rogue Hero 3D", 0, 24)); // NOI18N
        jLabel7.setText("... or select an answer from 4 options");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spongebob.png"))); // NOI18N
        jLabel16.setText("jLabel16");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minion.png"))); // NOI18N
        jLabel18.setText("jLabel18");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(written, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(124, 124, 124)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(written, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout testSelectorLayout = new javax.swing.GroupLayout(testSelector.getContentPane());
        testSelector.getContentPane().setLayout(testSelectorLayout);
        testSelectorLayout.setHorizontalGroup(
            testSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        testSelectorLayout.setVerticalGroup(
            testSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        testSelector.addWindowListener(new WindowAdapter()
            {
                public void windowClosed(WindowEvent e)
                {
                    System.exit(0);
                }

                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });

            writtenTest.setMinimumSize(new java.awt.Dimension(1017, 720));

            jPanel18.setBackground(new java.awt.Color(0, 204, 204));

            jLabel8.setFont(new java.awt.Font("Rogue Hero 3D", 0, 56)); // NOI18N
            jLabel8.setText("THE EXAM");

            question.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
            question.setText("9 + 10? ");

            user.setText("0");

            submitAnswer.setText("Submit");
            submitAnswer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    submitAnswerActionPerformed(evt);
                }
            });

            activateCalc1.setText("Calculator");
            activateCalc1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    activateCalc1ActionPerformed(evt);
                }
            });

            message.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
            message.setForeground(new java.awt.Color(255, 51, 0));

            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emoji1.png"))); // NOI18N
            jLabel10.setText("jLabel10");

            jLabel19.setFont(new java.awt.Font("Rogue Hero 3D", 0, 36)); // NOI18N
            jLabel19.setText("Can you do it?");

            jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buffemoji.png"))); // NOI18N
            jLabel20.setText("jLabel20");

            javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
            jPanel18.setLayout(jPanel18Layout);
            jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel19))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                    .addComponent(question)
                                    .addGap(124, 124, 124)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(357, 357, 357)
                    .addComponent(submitAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(127, 127, 127)
                    .addComponent(activateCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(71, 71, 71))
            );
            jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel20)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(question)
                                    .addGap(36, 36, 36)))
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(32, 32, 32)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submitAnswer)
                        .addComponent(activateCalc1))
                    .addGap(64, 64, 64)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(352, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout writtenTestLayout = new javax.swing.GroupLayout(writtenTest.getContentPane());
            writtenTest.getContentPane().setLayout(writtenTestLayout);
            writtenTestLayout.setHorizontalGroup(
                writtenTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            writtenTestLayout.setVerticalGroup(
                writtenTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(writtenTestLayout.createSequentialGroup()
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            writtenTest.addWindowListener(new WindowAdapter()
                {
                    public void windowClosed(WindowEvent e)
                    {
                        System.exit(0);
                    }

                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                });

                multipleChoice.setMinimumSize(new java.awt.Dimension(1017, 720));
                multipleChoice.setSize(new java.awt.Dimension(1017, 720));

                jPanel21.setBackground(new java.awt.Color(0, 204, 204));
                jPanel21.setMaximumSize(new java.awt.Dimension(1104, 758));
                jPanel21.setMinimumSize(new java.awt.Dimension(1104, 758));
                jPanel21.setPreferredSize(new java.awt.Dimension(1104, 758));
                jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                selector2.setText("[1104, 758]");
                selector2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        selector2ActionPerformed(evt);
                    }
                });
                jPanel21.add(selector2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 385, 347, 67));

                selector1.setText("[1104, 758]");
                selector1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        selector1ActionPerformed(evt);
                    }
                });
                jPanel21.add(selector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 287, 347, 67));

                selector4.setText("[1104, 758]");
                selector4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        selector4ActionPerformed(evt);
                    }
                });
                jPanel21.add(selector4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 576, 347, 67));

                selector3.setText("[1104, 758]");
                selector3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        selector3ActionPerformed(evt);
                    }
                });
                jPanel21.add(selector3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 483, 347, 67));

                jLabel14.setFont(new java.awt.Font("Rogue Hero 3D", 0, 48)); // NOI18N
                jLabel14.setText("Exam Time!");
                jPanel21.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

                question2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
                question2.setText("9 + 10?");
                jPanel21.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

                message1.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
                message1.setForeground(new java.awt.Color(255, 51, 0));
                jPanel21.add(message1, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 466, 488, 69));

                activateCalc2.setText("Calculator");
                activateCalc2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        activateCalc2ActionPerformed(evt);
                    }
                });
                jPanel21.add(activateCalc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 595, 188, 48));

                jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apunchbob.png"))); // NOI18N
                jLabel24.setText("jLabel24");
                jPanel21.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 310, 250));

                javax.swing.GroupLayout multipleChoiceLayout = new javax.swing.GroupLayout(multipleChoice.getContentPane());
                multipleChoice.getContentPane().setLayout(multipleChoiceLayout);
                multipleChoiceLayout.setHorizontalGroup(
                    multipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, Short.MAX_VALUE)
                );
                multipleChoiceLayout.setVerticalGroup(
                    multipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
                );

                multipleChoice.addWindowListener(new WindowAdapter()
                    {
                        public void windowClosed(WindowEvent e)
                        {
                            System.exit(0);
                        }

                        public void windowClosing(WindowEvent e)
                        {
                            System.exit(0);
                        }
                    });

                    calculator.setMinimumSize(new java.awt.Dimension(607, 383));

                    jPanel19.setBackground(new java.awt.Color(0, 204, 204));

                    jLabel9.setFont(new java.awt.Font("Phosphate", 0, 36)); // NOI18N
                    jLabel9.setText("Le Calculator");

                    num1.setText("0");
                    num1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            num1ActionPerformed(evt);
                        }
                    });

                    num2.setText("0");
                    num2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            num2ActionPerformed(evt);
                        }
                    });

                    jLabel11.setFont(new java.awt.Font("Phosphate", 0, 14)); // NOI18N
                    jLabel11.setText("First Number");

                    jLabel12.setFont(new java.awt.Font("Phosphate", 0, 14)); // NOI18N
                    jLabel12.setText("Second Number");

                    multiplyButton.setFont(new java.awt.Font("PingFang HK", 0, 18)); // NOI18N
                    multiplyButton.setText("x");
                    multiplyButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            multiplyButtonActionPerformed(evt);
                        }
                    });

                    divideButton.setFont(new java.awt.Font("PingFang HK", 0, 18)); // NOI18N
                    divideButton.setText("÷");
                    divideButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            divideButtonActionPerformed(evt);
                        }
                    });

                    addButton.setFont(new java.awt.Font("PingFang HK", 0, 18)); // NOI18N
                    addButton.setText("+");
                    addButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            addButtonActionPerformed(evt);
                        }
                    });

                    subtractButton.setFont(new java.awt.Font("PingFang HK", 0, 18)); // NOI18N
                    subtractButton.setText("-");
                    subtractButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            subtractButtonActionPerformed(evt);
                        }
                    });

                    jAnswer.setFont(new java.awt.Font("Phosphate", 0, 36)); // NOI18N
                    jAnswer.setText("ANSWER: ");

                    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
                    jPanel19.setLayout(jPanel19Layout);
                    jPanel19Layout.setHorizontalGroup(
                        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addGap(176, 176, 176))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addButton)
                                        .addComponent(divideButton))
                                    .addGap(74, 74, 74)
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(multiplyButton)
                                        .addComponent(subtractButton))
                                    .addGap(96, 96, 96))))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addGap(110, 110, 110)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(jLabel12)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel19Layout.setVerticalGroup(
                        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel9)
                            .addGap(21, 21, 21)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addButton)
                                .addComponent(subtractButton))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(multiplyButton)
                                .addComponent(divideButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                            .addComponent(jAnswer)
                            .addGap(38, 38, 38))
                    );

                    javax.swing.GroupLayout calculatorLayout = new javax.swing.GroupLayout(calculator.getContentPane());
                    calculator.getContentPane().setLayout(calculatorLayout);
                    calculatorLayout.setHorizontalGroup(
                        calculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    calculatorLayout.setVerticalGroup(
                        calculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );

                    results.setMinimumSize(new java.awt.Dimension(1017, 720));
                    results.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    jPanel20.setBackground(new java.awt.Color(0, 204, 204));
                    jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    jLabel13.setFont(new java.awt.Font("Kailasa", 0, 48)); // NOI18N
                    jLabel13.setText("Good Job!");
                    jPanel20.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 49, -1, -1));

                    finalScore.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
                    finalScore.setText("You got: ");
                    jPanel20.add(finalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 130, -1, -1));

                    finalGrade.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
                    finalGrade.setText("Your Grade:");
                    jPanel20.add(finalGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 210, -1, -1));

                    note.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
                    note.setText("b");
                    jPanel20.add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 275, 213, -1));

                    goBack1.setText("Return to Title Screen");
                    goBack1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            goBack1ActionPerformed(evt);
                        }
                    });
                    jPanel20.add(goBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 531, 212, 46));

                    list.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                        public int getSize() { return strings.length; }
                        public String getElementAt(int i) { return strings[i]; }
                    });
                    jScrollPane1.setViewportView(list);

                    jPanel20.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 56, 252, 311));

                    jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
                    jLabel3.setText("Wrong Questions");
                    jPanel20.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 21, -1, -1));

                    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emoji2.png"))); // NOI18N
                    jLabel22.setText("jLabel22");
                    jPanel20.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 41, 314, -1));

                    jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spunchbob.png"))); // NOI18N
                    jLabel23.setText("jLabel23");
                    jPanel20.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 379, 452, 233));

                    results.getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

                    results.addWindowListener(new WindowAdapter()
                        {
                            public void windowClosed(WindowEvent e)
                            {
                                System.exit(0);
                            }

                            public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                        });

                        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                        setBackground(new java.awt.Color(0, 0, 0));
                        setMinimumSize(new java.awt.Dimension(1017, 720));

                        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

                        jTabbedPane5.setBackground(new java.awt.Color(0, 0, 0));
                        jTabbedPane5.setForeground(new java.awt.Color(255, 0, 0));

                        jPanel8.setBackground(new java.awt.Color(0, 204, 204));
                        jPanel8.setForeground(new java.awt.Color(51, 204, 0));
                        jPanel8.setMaximumSize(new java.awt.Dimension(1017, 689));
                        jPanel8.setMinimumSize(new java.awt.Dimension(1017, 689));

                        start.setText("START TEST");
                        start.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                startActionPerformed(evt);
                            }
                        });

                        enableCalculator.setText("ENABLE CALCULATOR");
                        enableCalculator.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                enableCalculatorActionPerformed(evt);
                            }
                        });

                        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
                        jLabel2.setFont(new java.awt.Font("Rogue Hero 3D", 2, 56)); // NOI18N
                        jLabel2.setText("PRACTICE TEST 3000");

                        amount.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
                        amount.setText("10");
                        amount.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                amountActionPerformed(evt);
                            }
                        });

                        errorMesg.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
                        errorMesg.setForeground(new java.awt.Color(255, 0, 51));
                        errorMesg.setText(" ");

                        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
                        jLabel4.setText("you like? (Max of 50, Min of 5)");

                        indicator.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
                        indicator.setForeground(new java.awt.Color(0, 255, 0));
                        indicator.setText("ON");

                        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
                        jLabel15.setText("How many questions would ");

                        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars.png"))); // NOI18N
                        jLabel21.setText("jLabel21");

                        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                        jPanel8.setLayout(jPanel8Layout);
                        jPanel8Layout.setHorizontalGroup(
                            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel4))))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(errorMesg)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(enableCalculator)
                                        .addGap(29, 29, 29)
                                        .addComponent(indicator)
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(start)
                                        .addGap(63, 63, 63))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap(196, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(189, 189, 189))
                        );
                        jPanel8Layout.setVerticalGroup(
                            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(enableCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(indicator))
                                        .addGap(26, 26, 26)
                                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(errorMesg)
                                        .addGap(75, 75, 75))))
                        );

                        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                        jPanel5.setLayout(jPanel5Layout);
                        jPanel5Layout.setHorizontalGroup(
                            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        jPanel5Layout.setVerticalGroup(
                            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                        jPanel2.setLayout(jPanel2Layout);
                        jPanel2Layout.setHorizontalGroup(
                            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        jPanel2Layout.setVerticalGroup(
                            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        jTabbedPane5.addTab("Test", jPanel2);

                        jPanel14.setBackground(new java.awt.Color(0, 204, 204));

                        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
                        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

                        aboutUs.setFont(new java.awt.Font("Apple Chancery", 0, 24)); // NOI18N
                        aboutUs.setText("I am now the family guy funny moments, funniest moments of family guy");

                        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
                        jPanel15.setLayout(jPanel15Layout);
                        jPanel15Layout.setHorizontalGroup(
                            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(17, Short.MAX_VALUE))
                        );
                        jPanel15Layout.setVerticalGroup(
                            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(aboutUs)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );

                        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
                        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

                        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo.png"))); // NOI18N

                        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
                        jPanel17.setLayout(jPanel17Layout);
                        jPanel17Layout.setHorizontalGroup(
                            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addGap(19, 19, 19))
                        );
                        jPanel17Layout.setVerticalGroup(
                            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                        );

                        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
                        jPanel14.setLayout(jPanel14Layout);
                        jPanel14Layout.setHorizontalGroup(
                            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                        );
                        jPanel14Layout.setVerticalGroup(
                            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(11, Short.MAX_VALUE))
                        );

                        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                        jPanel6.setLayout(jPanel6Layout);
                        jPanel6Layout.setHorizontalGroup(
                            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        jPanel6Layout.setVerticalGroup(
                            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                        jPanel3.setLayout(jPanel3Layout);
                        jPanel3Layout.setHorizontalGroup(
                            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        jPanel3Layout.setVerticalGroup(
                            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        jTabbedPane5.addTab("About Us", jPanel3);

                        jPanel9.setBackground(new java.awt.Color(0, 204, 204));

                        jLabel1.setFont(new java.awt.Font("Rogue Hero 3D", 0, 36)); // NOI18N
                        jLabel1.setText("What would you like to learn about?");

                        jPanel10.setBackground(new java.awt.Color(0, 204, 204));
                        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math1.png"))); // NOI18N
                        jLabel26.setText("jLabel26");
                        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, 90));

                        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math.png"))); // NOI18N
                        jLabel25.setText("jLabel25");
                        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 110, 110));

                        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math2.png"))); // NOI18N
                        jLabel27.setText("jLabel27");
                        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 100, 110));

                        jTextArea1.setEditable(false);
                        jTextArea1.setColumns(20);
                        jTextArea1.setRows(5);
                        jTextArea1.setText("Adding 3 digit numbers together might look hard at first, but is actually very \neasy. To show you, let's do the question, \"434 + 839\", together.\n\nFirst, take out a piece of paper, and draw the two numbers on top of each \nother, with a line underneath the bottom number. \n\nIt should look something like this:\n");
                        jScrollPane2.setViewportView(jTextArea1);

                        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 469, 170));

                        jTextArea2.setEditable(false);
                        jTextArea2.setColumns(20);
                        jTextArea2.setRows(5);
                        jTextArea2.setText("Now, add the numbers from the very right collumn together, which is \"4 + 9\".\nWrite the answer (13) underneath the line. Now, if your answer is ever 10 or \nhigher (which it is), you should take the extra \"1\" of the answer, and write it \nover to the top of the second column, instead of under the line with the \"3\". \n\nYour page should now look like this:\n");
                        jScrollPane3.setViewportView(jTextArea2);

                        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 470, 190));

                        jTextArea3.setEditable(false);
                        jTextArea3.setColumns(20);
                        jTextArea3.setRows(5);
                        jTextArea3.setText("Now, you should add the numbers from the middle column together. \nHowever, because you also wrote an additional \"1\" above the column, you \nneed to add it as well (3 + 3 + 1). You then write the answer next to the \nnumber from before, using the \"above 10\" rule if needed (here, it isn't).\n\nYour equation should now look like this:");
                        jScrollPane4.setViewportView(jTextArea3);

                        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 469, 190));

                        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math3.png"))); // NOI18N
                        jLabel28.setText("jLabel28");
                        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 100, -1));

                        jTextArea4.setEditable(false);
                        jTextArea4.setColumns(20);
                        jTextArea4.setRows(5);
                        jTextArea4.setText("Finally, you should add the last column (the far left) together. Because this is \nthe last column, you can ignore the rule of \"above 10\". If your result is above \n10, you may simply write it underneath the line, next to the other numbers. \nNow, the number under the line is your final answer.\n\nYour final calculation should look like this:");
                        jScrollPane5.setViewportView(jTextArea4);

                        jPanel10.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 467, 190));

                        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math4.png"))); // NOI18N
                        jLabel29.setText("jLabel29");
                        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 120, -1));

                        jTextArea5.setEditable(false);
                        jTextArea5.setColumns(20);
                        jTextArea5.setRows(5);
                        jTextArea5.setText("One final note: If you are adding a 3 digit number with a 2 digit number,\n(for example: 111 + 22), then when writing the \"22\", you only fill in the first \ntwo columns. You leave the space in the last column (the far left) blank, and\nwhen adding that column you just pretend that space is actually \"0\". \n\nSo, 111 + 22 would look like this:");
                        jScrollPane6.setViewportView(jTextArea5);

                        jPanel10.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 467, 220));

                        jTabbedPane1.addTab("3 Digit Addition", jPanel10);

                        jPanel11.setBackground(new java.awt.Color(0, 204, 204));
                        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math6.png"))); // NOI18N
                        jLabel31.setText("jLabel31");
                        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 90, -1));

                        jTextArea7.setEditable(false);
                        jTextArea7.setColumns(20);
                        jTextArea7.setRows(5);
                        jTextArea7.setText("Now, take the numbers from the right column, and subtract them. Since 4 is \nsmaller than 9, you now have to \"borrow\" a ten in order to solve.Take away \n1 from the top number in the next column (so 4 becomes 3), and add 10 to \nthe 4 (so that now the question is 14 - 9). Now, do the question normally,\nand write your answer under the line, on the same column.\n\nOnce you finish, the equation should look like this:");
                        jScrollPane8.setViewportView(jTextArea7);

                        jPanel11.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 469, 190));

                        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math5.png"))); // NOI18N
                        jLabel30.setText("jLabel30");
                        jPanel11.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 130, 90));

                        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math7.png"))); // NOI18N
                        jLabel32.setText("jLabel32");
                        jPanel11.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 80, 100));

                        jTextArea8.setEditable(false);
                        jTextArea8.setColumns(20);
                        jTextArea8.setRows(5);
                        jTextArea8.setText("Subtracting with 3 numbers is a lot like adding with 3 numbers, so I \nrecommend that you look at the \"addition\" lesson first. To teach you how to\nsubtract, we will do the question \"844 - 439\" together.\n\nFirst, take out a piece of paper, and like with the addition, write the two \nnumbers on top of each other. Then, write a line underneath the bottom \nnumber. It should now look like this:");
                        jScrollPane9.setViewportView(jTextArea8);

                        jPanel11.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 468, 210));

                        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math8.png"))); // NOI18N
                        jLabel33.setText("jLabel33");
                        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 90, -1));

                        jTextArea9.setEditable(false);
                        jTextArea9.setColumns(20);
                        jTextArea9.setRows(5);
                        jTextArea9.setText("Now, you need to subtract the second column. Since we took 1 away from \nthe top number earlier, the question that we have to do is now \"3 - 3\", \ninstead of \"4 - 3\". \n\nYour answer should now look like this:");
                        jScrollPane10.setViewportView(jTextArea9);

                        jPanel11.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 470, 150));

                        jTextArea10.setEditable(false);
                        jTextArea10.setColumns(20);
                        jTextArea10.setRows(5);
                        jTextArea10.setText("Finally, just like in addition, you now have to do the final, left column. You \nsimply solve \"8 - 4\", and write the answer underneath the line, next to the \nother two numbers. \n\nYour final result should look like this:");
                        jScrollPane11.setViewportView(jTextArea10);

                        jPanel11.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 470, 200));

                        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math9.png"))); // NOI18N
                        jLabel34.setText("jLabel34");
                        jPanel11.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 110, -1));

                        jTextArea11.setEditable(false);
                        jTextArea11.setColumns(20);
                        jTextArea11.setRows(5);
                        jTextArea11.setText("One more important note: If you have to \"borrow\" a ten, but the next number \nis a zero, you have to do something different. Let's do 100 - 94 as an example.\nFind the next number that isn't a zero (here, the \"1\" in \"100\"), and take one \naway from that instead. Then, for every zero until the column you were doing, \nreplace the \"0\" with a \"9\". Finally, for the number in your column, add 10 like \nnormal (even if the number in your column is 0). \n\nThe equation should look like this:");
                        jScrollPane12.setViewportView(jTextArea11);

                        jPanel11.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 490, 240));

                        jTabbedPane1.addTab("3 Digit Subtraction", jPanel11);

                        jPanel12.setBackground(new java.awt.Color(0, 204, 204));
                        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        jTextArea12.setEditable(false);
                        jTextArea12.setColumns(20);
                        jTextArea12.setRows(5);
                        jTextArea12.setText("As a completely new subject, multiplication might seem complicated, but it \nmore simple than you think. Think of multiplication as \"repeated addition\",\nwhere you just repeat adding a number with itself. To help you understand, \nwe'll do a few questions together. ");
                        jScrollPane13.setViewportView(jTextArea12);

                        jPanel12.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 470, 120));

                        jTextArea13.setEditable(false);
                        jTextArea13.setColumns(20);
                        jTextArea13.setRows(5);
                        jTextArea13.setText("Think of multiplication like this - The first number is the number you are \nadding, and the second number is the number of times you are adding it. \nFor example, 7 x 8 means you are adding 7 together 8 times. So, 7 x 8 would\nlook like 7 + 7 + 7 + 7 + 7 + 7 + 7 + 7. Any multiplication question can \nactually be flipped, so by adding 8 together 7 times, you would get the same\nanswer. ");
                        jScrollPane14.setViewportView(jTextArea13);

                        jPanel12.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 478, 126));

                        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math10.png"))); // NOI18N
                        jLabel35.setText("jLabel35");
                        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 220, -1));

                        jTextArea14.setEditable(false);
                        jTextArea14.setColumns(20);
                        jTextArea14.setRows(5);
                        jTextArea14.setText("However, this may be hard to do, so let's visualise the problem (7x8). Take a\npiece of paper, and draw 7 circles. Now, draw 8 dots inside of each of those\ncircles. Count all of the dots together, and you will get the answer to the \nquestion. \n\nThe circle method would look something like this:");
                        jScrollPane15.setViewportView(jTextArea14);

                        jPanel12.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 470, 290));

                        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math11.png"))); // NOI18N
                        jLabel36.setText("jLabel36");
                        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 250, -1));

                        jTextArea15.setEditable(false);
                        jTextArea15.setColumns(20);
                        jTextArea15.setRows(5);
                        jTextArea15.setText("Let's do another question, just to show you one more time. Let's say that we\nhave to solve 5 x 9. Draw 5 circles, and then draw 9 dots in side of each \ncircle. If you add together all the dots, you will get your final answer. \n\nThis question would look like this:");
                        jScrollPane16.setViewportView(jTextArea15);

                        jPanel12.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 470, 320));

                        jTabbedPane1.addTab("Multiplication", jPanel12);

                        jPanel13.setBackground(new java.awt.Color(0, 204, 204));
                        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        jTextArea6.setEditable(false);
                        jTextArea6.setColumns(20);
                        jTextArea6.setRows(5);
                        jTextArea6.setText("Division is probably the hardest to understand subject out of the 4 lessons. \nEssentially, division is the opposite of multiplication. Because of this, I would\nlike if you read the \"multiplication\" lesson first, as without that this will be \nharder to understand. Unlike multiplication, where we used groups and dots\nin order to find the total amount in an amount of groups, division is like \ntaking a big amount, and finding how many dots would be in just one group.");
                        jScrollPane7.setViewportView(jTextArea6);

                        jPanel13.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 469, 150));

                        jTextArea16.setEditable(false);
                        jTextArea16.setColumns(20);
                        jTextArea16.setRows(5);
                        jTextArea16.setText("Let's try a few problems. First, let's do 50 ÷ 5. Now, to do this, you would \nsee how many times you can take away \"5\". Subtract 5 from \"50\", and count\neverytime you do it. So, 50 - 5 would make 45, and you would count \"1\". \nThen, 45 - 5 would make 40, and you would count \"2\". 40 - 5 would make \n35, and you would count \"3\". Do this over and over again until the big \nnumber becomes \"0\". Then, the amount of times you have counted is your \nanswer (Here, the answer is \"10\").");
                        jScrollPane17.setViewportView(jTextArea16);

                        jPanel13.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 469, 170));

                        jTextArea17.setEditable(false);
                        jTextArea17.setColumns(20);
                        jTextArea17.setRows(5);
                        jTextArea17.setText("Now, let's do a different problem, \"42 ÷ 6\". Take the big number (42), and \ntry seeing how many times you can take away \"6\". So, 42 - 6 would make \n36, and you would count \"1\". Then, 36 - 6 would make 30, and you would \ncount \"2\". 30 - 6 would make 24, and you would count \"3\". You do this\nagain and again until the big number is now \"0\", and the number you have \ncounted is now your answer. Here, it would be \"7\".");
                        jScrollPane18.setViewportView(jTextArea17);

                        jPanel13.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 469, 180));

                        jTextArea18.setEditable(false);
                        jTextArea18.setColumns(20);
                        jTextArea18.setRows(5);
                        jTextArea18.setText("If that was a little hard to understand, don't be scared - I have one more method. \nLet's do \"50 ÷ 5\" again, to show you. Now, do one of the next two:\n\n1. You can draw 50 dots/little circles on the page. Now, sort these 50 dots into 5 \nbig circles, so that each circle has the same amount of dots. Make sure you sort \nall of the dots! Once you finish, count how many dots are in one big circle. That is \nyour answer (there should be 10).\n\n\n2. You can also try drawing 5 big circles, and then slowly adding dots to them in a \nrow. Count down by one every time you add a dot. When you finish adding all the\ndots, count the amount of dots in one circle. The number of dots in one circle is\nyour answer!");
                        jScrollPane19.setViewportView(jTextArea18);

                        jPanel13.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 510, 243));

                        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

                        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math12.png"))); // NOI18N
                        jLabel37.setText("jLabel37");

                        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
                        jPanel22.setLayout(jPanel22Layout);
                        jPanel22Layout.setHorizontalGroup(
                            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(122, Short.MAX_VALUE))
                        );
                        jPanel22Layout.setVerticalGroup(
                            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel37)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );

                        jPanel13.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 500, 230));

                        jTabbedPane1.addTab("Division", jPanel13);

                        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                        jPanel9.setLayout(jPanel9Layout);
                        jPanel9Layout.setHorizontalGroup(
                            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(108, 108, 108))
                        );
                        jPanel9Layout.setVerticalGroup(
                            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane1))
                        );

                        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                        jPanel7.setLayout(jPanel7Layout);
                        jPanel7Layout.setHorizontalGroup(
                            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        jPanel7Layout.setVerticalGroup(
                            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                        jPanel4.setLayout(jPanel4Layout);
                        jPanel4Layout.setHorizontalGroup(
                            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        jPanel4Layout.setVerticalGroup(
                            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        jTabbedPane5.addTab("Lesson", jPanel4);

                        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(jPanel1Layout);
                        jPanel1Layout.setHorizontalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        );
                        jPanel1Layout.setVerticalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE))
                        );

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                        getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        layout.setVerticalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        pack();
                    }// </editor-fold>//GEN-END:initComponents

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed

    }//GEN-LAST:event_amountActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        /*
        * The following chunk of code (Lines 1297 - 1316) concern the button that starts the exam on the JFrame.
        * Using the "amount" textField, this sets the amount of questions in the test, before continuing. 
        * There are two possible "errors" that can happen. Using a try-catch statement, if the code detects a NumberFormatException (as a result of the parsing nessecary due to the TextField), a message will be displayed for 2.5 seconds (Done with the help of a swing Timer).
        * The other error occurs if the number inputted was not within the requirements stated on the page. It utilizes a timer similarly to the last error, erasing the message when the timer runs out.
        * If none of this is encountered, the amount entered is set as the amount of questions, and the testSelector dialog is made visible (while the main page is made invisible).
        */
        
        try {
            questionCounter = Integer.parseInt(amount.getText());
            if (questionCounter < 5 || questionCounter > 50) {
                errorMesg.setText("Please enter a number less than 50 and more than 5.");
                Timer timer = new Timer(2500, event -> {
                    errorMesg.setText(" ");});
                timer.setRepeats(false);
                timer.start();
                } else {
                    questionAmount = questionCounter;
                    testSelector.setVisible(true);
                    this.setVisible(false);
            }
        } catch (NumberFormatException e) {
            errorMesg.setText("Enter an actual number.");
            Timer timer = new Timer(2500, event -> {
                errorMesg.setText(" ");});
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_startActionPerformed

    private void multipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleActionPerformed
        /*
        * The next two buttons run the code (Lines 1321 - 1337) for the two buttons on the testSelector screen. Because they are fairly similar, I am commenting them both here.
        * If this button is clicked, for the "multiple choice", then the multipleChoice Dialog is set visible, while the testSelector is made invisible. Then, the generate() method is run (setting the question2 label to display a question), alongside another method exlusively made for the multiple choice, setter(). Both will be more thouroughly explained later.
        * Similarly, if the "written" button is clicked, then it instead opens the written test, using the same method as the multiple choice. generate() is once again used, and the "question" label is set to the random question. 
        */
        
        
        
        multipleChoice.setVisible(true);
        testSelector.setVisible(false);
        question2.setText(generate());
        setter();
    }//GEN-LAST:event_multipleActionPerformed

    private void writtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writtenActionPerformed
        writtenTest.setVisible(true);
        testSelector.setVisible(false);
        question.setText(generate());
    }//GEN-LAST:event_writtenActionPerformed

    private void submitAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAnswerActionPerformed
        /*
        * This button is used to submit answers on the written test. 
        * Inside of a try-catch statement (in order to catch a NumberFormatException), I get the text from the textField, and then compare it to the correct answer (using the variable of the same name). If they match, the label "message"'s color is set to green, and its text displays "Good Job!". Then, using a timer, I make it so that the text is wiped after 2 seconds. After, the generate() method is used, generating a new question, and the "questionCounter" and "correct" variables get 1 taken away and added respectively. 
        * If the two values do not match, a similar code runs, where the message is set to red, and to display the right answer. This is also wiped after 2 seconds, like the correct message. The generate() method is used, and the "questionCounter" variable (which, if not clear, tracks the amount of questions left), gets 1 taken away. Additionally, the "questions" and "answers" ArrayLists are added with the incorrectly answered question, and their correct answer.
        * If, after running the code that I have mentioned, "questionCounter" is equal to zero, then the writtenTest is set to be invisible (alongside the calculator), and the results screen is set to be visible. Furthermore, the questionAmount (which stored the initial amount of questions) and the correct variables are used to set a label (which notifies how many questions the user got right). The grade() and setList() methods are then run, which are further explained below. 
        */
        
        try {
            int number = Integer.parseInt(user.getText());
            if (number == answer) {
                message.setText("Good Job!");
                message.setForeground(Color.green);
                regulator = 1;
                Timer timer = new Timer(2000, event -> {
                    message.setText("");
                    regulator = 0;});
                timer.setRepeats(false);
                timer.start();
                question.setText(generate());
                questionCounter = questionCounter - 1;
                correct = correct + 1;
            } else {
                message.setText("Sorry, the right answer was " + answer + "...");
                message.setForeground(Color.red);
                questions.add(question.getText());
                answers.add(answer);
                Timer timer = new Timer(2000, event -> {
                    message.setText("");});
                timer.setRepeats(false);
                timer.start();
                question.setText(generate());
                questionCounter = questionCounter - 1;
                
            }
        } catch (NumberFormatException e) {
            message.setForeground(Color.red);
            message.setText("Please, don't enter anything else than a number in your answer.");
        } 

        if (questionCounter == 0) {
            writtenTest.setVisible(false);
            calculator.setVisible(false);
            results.setVisible(true);
            finalScore.setText("You got: " + correct + "/" + questionAmount);
            grade();
            setList();

        }
    }//GEN-LAST:event_submitAnswerActionPerformed

    private void enableCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableCalculatorActionPerformed
        
        /*
        * This button is used to enable or disable the calculator. The variable "indicate" is used to track if the calculator is On or not.
        * If indicate = 0 (therefore enabled), and the button is clicked, indicate is set to 1 (tracking that it is now off), and the indicator label is set to the text "OFF".
        * Like the above, if the button is clicked while indicate = 1, the opposite happens, and the calculator is set to "ON". For both variants, the "indicator" will also change color appropriately. 
        */
        
        if (indicate == 0) {
            indicator.setText("OFF");
            indicator.setForeground(Color.red);
            indicate = 1;
        } else {
            indicator.setText("ON");
            indicator.setForeground(Color.green);
            indicate = 0;
        }
    }//GEN-LAST:event_enableCalculatorActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num2ActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        /*
        * This is the code for the divide button on the calculator. Because all of the calculator buttons perform the exact same code (save the operation itself), I will only comment this one. 
        * Inside of a try-catch loop, the button parses the date from the two text fields, and then calculates for the desired answer (in this case, division). Then, the "jAnswer" label is set to display the answer.
        * If a NumberFormatException is caught, an error message is displayed instead of an answer, somewhat mimicking the format real calculators use. I should also mention that all answers are rounded, as I do not want to confuse 3rd Graders with decimals.
        */
        
        
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double sum = n1 / n2;
            jAnswer.setText("ANSWER: " + Math.round(sum) + "");
        } catch (NumberFormatException e) {
            jAnswer.setText("ANSWER: SYNTAX ERROR");

        }

    }//GEN-LAST:event_divideButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double sum = n1 + n2;
            jAnswer.setText("ANSWER: " + Math.round(sum) + "");
        } catch (NumberFormatException e) {
            jAnswer.setText("ANSWER: SYNTAX ERROR");

        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void activateCalc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateCalc1ActionPerformed
        // This is the code that runs when the "Calculator" button is clicked on the writtenTest. Simply, if "indicate" (The variable that tracks if the calculator is enabled), is 0, then the calculator opens. There is another button like this for the multipleChoice test, that I will not comment.
        
        if (indicate == 0) {
            calculator.setVisible(true);
        }
    }//GEN-LAST:event_activateCalc1ActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double sum = n1 - n2;
            
            jAnswer.setText("ANSWER: " + Math.round(sum) + "");
        } catch (NumberFormatException e) {
            jAnswer.setText("ANSWER: SYNTAX ERROR");

        }

    }//GEN-LAST:event_subtractButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double sum = n1 * n2;
            jAnswer.setText("ANSWER: " + Math.round(sum) + "");
        } catch (NumberFormatException e) {
            jAnswer.setText("ANSWER: SYNTAX ERROR");

        }

    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void selector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selector1ActionPerformed
        /*
        * This code is for what happens when a multiple choice option is clicked. 
        * The following code, for each 1 of the "selectors", is very long and repetitive. As such, I will only comment this button. 
        * Additionally, this code is for checking the right answers, and as a result is surprisingly similar to the "checking" code for the written test. Due to this, I will somewhat simplify parts of my explanation, as I am assuming you have already read my previous comments. 
        * Using the "parser" variable, I get the number that was displayed on the button clicked, and I compare it with the answer using an if statement. 
        * If the answer was correct, a message like in the written test appears, and the button you clicked is colored green. 
        * I then use a timer, which waits two seconds before changing the color back. In order to avoid confusion and error, I use the variable "regulator", and an if-else statement to make all of the selector buttons unusable (the if statement states that nothing happens if the regulator is set to a certain value). The regulator variable is reset alongside the color, and the message is wiped as well. 
        * I also then use the generate() and setter() methods to set up a new questions, and the questionCounter and correct variables are updated accordingly. 
        * If the answer was wrong, a different message is displayed, and the button clicked is set to be pink. My "parser" variable, in combination with a chain of if statements then check if for which button has the correct value, and set that button to green.
        * In this case, the buttons are disabled, wiped, the questions are generated and the variables are updates the same way as with a correct answer (with the addition of the two ArrayLists recieving the wrongly answered question, and without the "correct" variable being updated).
        * Just like in the previous code for the written test, the button runs a special program if "questionCounter" is found to be equal to zero.
        */
        
        
        if (regulator == 1) {
            
        } else {
            parser = Integer.parseInt(selector1.getText());
            selector1.setBackground(Color.white);
            selector2.setBackground(Color.white);
            selector3.setBackground(Color.white);
            selector4.setBackground(Color.white);
            if (parser == answer) {
                regulator = 1;
                selector1.setBackground(Color.green);
                message1.setText("<html> You got it right! Good Job! <html>");
                message1.setForeground(Color.green);
                Timer timer = new Timer(2000, event -> {
                    selector1.setBackground(Color.white);
                    selector2.setBackground(Color.white);
                    selector3.setBackground(Color.white);
                    selector4.setBackground(Color.white);
                    question2.setText(generate());
                    message1.setText("");
                    setter();
                    regulator = 0;});
                timer.setRepeats(false);
                timer.start();
                questionCounter = questionCounter - 1;
                correct = correct + 1;
            } else {
                regulator = 1;
                message1.setText("<html> Sorry, the answer was actually " + answer + "... <html>");
                message1.setForeground(Color.red);
                selector1.setBackground(Color.pink);
                parser = Integer.parseInt(selector2.getText());
                if (parser == answer) {
                    selector2.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector3.getText());
                if (parser == answer) {
                    selector3.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector4.getText());
                if (parser == answer) {
                    selector4.setBackground(Color.green);
                }
                questions.add(question2.getText());
                answers.add(answer);
                Timer timer = new Timer(2000, event -> {
                    selector1.setBackground(Color.white);
                    selector2.setBackground(Color.white);
                    selector3.setBackground(Color.white);
                    selector4.setBackground(Color.white);
                    question2.setText(generate());
                    message1.setText("");
                    setter();
                    regulator = 0;});
                timer.setRepeats(false);
                timer.start();
                questionCounter = questionCounter - 1;
            }

            if (questionCounter == 0) {
                multipleChoice.setVisible(false);
                calculator.setVisible(false);
                results.setVisible(true);
                finalScore.setText("You got: " + correct + "/" + questionAmount);
                grade();
                setList();

            }
        }
    }//GEN-LAST:event_selector1ActionPerformed

    private void selector2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selector2ActionPerformed
        if (regulator == 1) {
            
        } else {
            parser = Integer.parseInt(selector2.getText());
            selector1.setBackground(Color.white);
            selector2.setBackground(Color.white);
            selector3.setBackground(Color.white);
            selector4.setBackground(Color.white);
            if (parser == answer) {
                regulator = 1;
                selector2.setBackground(Color.green);
                message1.setText("<html> You got it right! Good Job! <html>");
                message1.setForeground(Color.green);
                Timer timer = new Timer(2000, event -> {
                    selector1.setBackground(Color.white);
                    selector2.setBackground(Color.white);
                    selector3.setBackground(Color.white);
                    selector4.setBackground(Color.white);
                    question2.setText(generate());
                    message1.setText("");
                    setter();
                    regulator = 0;});
                timer.setRepeats(false);
                timer.start();
                questionCounter = questionCounter - 1;
                correct = correct + 1;
            } else {
                regulator = 1;
                message1.setText("<html> Sorry, the answer was actually " + answer + "... <html>");
                message1.setForeground(Color.red);
                selector2.setBackground(Color.pink);
                parser = Integer.parseInt(selector1.getText());
                if (parser == answer) {
                    selector1.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector3.getText());
                if (parser == answer) {
                    selector3.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector4.getText());
                if (parser == answer) {
                    selector4.setBackground(Color.green);
                }
                questions.add(question2.getText());
                answers.add(answer);
                Timer timer = new Timer(2000, event -> {
                    selector1.setBackground(Color.white);
                    selector2.setBackground(Color.white);
                    selector3.setBackground(Color.white);
                    selector4.setBackground(Color.white);
                    question2.setText(generate());
                    message1.setText("");
                    setter();
                    regulator = 0;});
                timer.setRepeats(false);
                timer.start();
                questionCounter = questionCounter - 1;
            }

            if (questionCounter == 0) {
                multipleChoice.setVisible(false);
                calculator.setVisible(false);
                results.setVisible(true);
                finalScore.setText("You got: " + correct + "/" + questionAmount);
                grade();
                setList();

            }
        }
    }//GEN-LAST:event_selector2ActionPerformed

    private void selector3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selector3ActionPerformed
        if (regulator == 1) {
            
        } else {
            parser = Integer.parseInt(selector3.getText());
            selector1.setBackground(Color.white);
            selector2.setBackground(Color.white);
            selector3.setBackground(Color.white);
            selector4.setBackground(Color.white);
            if (parser == answer) {
                selector3.setBackground(Color.green);
                regulator = 1;
                message1.setText("<html> You got it right! Good Job! <html>");
                message1.setForeground(Color.green);
                Timer timer = new Timer(2000, event -> {
                        selector1.setBackground(Color.white);
                        selector2.setBackground(Color.white);
                        selector3.setBackground(Color.white);
                        selector4.setBackground(Color.white);
                        question2.setText(generate());
                        message1.setText("");
                        setter();
                        regulator = 0;});
                    timer.setRepeats(false);
                    timer.start();
                questionCounter = questionCounter - 1;
                correct = correct + 1;
            } else {
                regulator = 1;
                questions.add(question2.getText());
                answers.add(answer);
                message1.setText("<html> Sorry, the answer was actually " + answer + "... <html>");
                message1.setForeground(Color.red);
                Timer timer = new Timer(2000, event -> {
                        selector1.setBackground(Color.white);
                        selector2.setBackground(Color.white);
                        selector3.setBackground(Color.white);
                        selector4.setBackground(Color.white);
                        question2.setText(generate());
                        message1.setText("");
                        setter();
                        regulator = 0;});
                    timer.setRepeats(false);
                    timer.start();
                selector3.setBackground(Color.pink);
                parser = Integer.parseInt(selector2.getText());
                if (parser == answer) {
                    selector2.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector1.getText());
                if (parser == answer) {
                    selector1.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector4.getText());
                if (parser == answer) {
                    selector4.setBackground(Color.green);
                }

                questionCounter = questionCounter - 1;
            }

            if (questionCounter == 0) {
                multipleChoice.setVisible(false);
                calculator.setVisible(false);
                results.setVisible(true);
                finalScore.setText("You got: " + correct + "/" + questionAmount);
                grade();
                setList();

            }
        }
    }//GEN-LAST:event_selector3ActionPerformed

    private void selector4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selector4ActionPerformed
        if (regulator == 1) {
            
        } else {
            parser = Integer.parseInt(selector4.getText());
            selector1.setBackground(Color.white);
            selector2.setBackground(Color.white);
            selector3.setBackground(Color.white);
            selector4.setBackground(Color.white);
            if (parser == answer) {
                regulator = 1;
                message1.setText("<html> You got it right! Good Job! <html>");
                message1.setForeground(Color.green);
                selector4.setBackground(Color.green);
                Timer timer = new Timer(2000, event -> {
                    selector1.setBackground(Color.white);
                    selector2.setBackground(Color.white);
                    selector3.setBackground(Color.white);
                    selector4.setBackground(Color.white);
                    question2.setText(generate());
                    message1.setText("");
                    setter();
                    regulator = 0;});
                timer.setRepeats(false);
                timer.start();
                questionCounter = questionCounter - 1;
                correct = correct + 1;
            } else {
                regulator = 1;
                message1.setText("<html> Sorry, the answer was actually " + answer + "... <html>");
                message1.setForeground(Color.red);
                questions.add(question2.getText());
                answers.add(answer);
                selector4.setBackground(Color.pink);
                parser = Integer.parseInt(selector2.getText());
                if (parser == answer) {
                    selector2.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector3.getText());
                if (parser == answer) {
                    selector3.setBackground(Color.green);
                }
                parser = Integer.parseInt(selector1.getText());
                if (parser == answer) {
                    selector1.setBackground(Color.green);
                }
                Timer timer = new Timer(2000, event -> {
                    selector1.setBackground(Color.white);
                    selector2.setBackground(Color.white);
                    selector3.setBackground(Color.white);
                    selector4.setBackground(Color.white);
                    question2.setText(generate());
                    message1.setText("");
                    setter();
                    regulator = 0;});
                timer.setRepeats(false);
                timer.start();
                questionCounter = questionCounter - 1;
            }

            if (questionCounter == 0) {
                multipleChoice.setVisible(false);
                calculator.setVisible(false);
                results.setVisible(true);
                finalScore.setText("You got: " + correct + "/" + questionAmount);
                grade();
                setList();

            }
        }
    }//GEN-LAST:event_selector4ActionPerformed

    private void goBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBack1ActionPerformed
        // This is the code for the Button that sends you back to the title screen. It simply sets the original JFrame to be visible, and set the results screen to be invisible. Additionally, the "correct" variable is set back to zero, and the ArrayLists for storing the wrong questions and their answers are wiped. 
        
        results.setVisible(false);
        this.setVisible(true);
        correct = 0;
        questions.clear();
        answers.clear();
    }//GEN-LAST:event_goBack1ActionPerformed

    private void activateCalc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateCalc2ActionPerformed
        if (indicate == 0) {
            calculator.setVisible(true);
        }
    }//GEN-LAST:event_activateCalc2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {   //Windows for colored Tabs
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MathApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathApplication().setVisible(true);
            }
        });

    }
    
    // Past this point, all of the comments will be related to the various methods used. 
    
        /*
        * This method, generate() is used to generate the questions, and their wrong answers for the multiple choice test.
        * It has 5 of its own variables - c (which is returned as the question to be set for a label), numb1, 2 and 3 (which are for generating the different numbers pertaining to the questions, and 3 being as additional storage), and sign (which determines what kind of question is generated).
        * The "sign" variable randomly generates one of four numbers, which then determines the type of question based on the number.
        * If sign was equal to 1, then an addition question is generated. numb1 and numb2 are randomly generated up to 999 (though numb1 cannot be less than 100), and the two numbers make up the question. The answer is then calculated and set to its variable.
        * Then, 3 fake answers are generated, and are checked to be positive, within 200 of the correct answer, and unequal to the right answer (or each other).
        * If sign was equal to 2, than an subtraction question is generated, in the same manner as the addition questions (though the second number is bound to the first, in order to always get a proper question). The fake answers are generated similarly as with addition.
        * If sign was equal to 3, a multiplication question is generated. numb1 and numb2 are randomly generated up to 12, and one of the fake answers is a miscalculated version of the question, in order to seem more believable. 
        * If sign was equal to 4, a division question is generated. numb1 and numb2 are generated like a multiplication question, but numb3 holds the calculated result. Then, the question is set to be numb3 divided by numb1, setting numb2 as the answer. One of the fake answers is set to always be one away from the real answer. 
        */
    public String generate() {
        String c;
        int numb1;
        int numb2;
        int numb3;
        int sign = rand.nextInt(4) + 1;
        if (sign == 1) {
            numb1 = rand.nextInt(900) + 100;
            numb2 = rand.nextInt(999) + 1;
            c = numb1 + " + " + numb2 + "?";
            answer = numb1 + numb2;
            fake2 = rand.nextInt(answer + 100);
            fake3 = rand.nextInt(answer + 100);
            while (true) {
                fake = rand.nextInt((answer + 100));
                if (fake > (answer - 100) && fake != answer && fake > 0) {
                    break;
                } else {
                    continue;
                }
            }
            while (true) {
                if (fake2 > (answer - 100) && fake2 != answer && fake2 != fake && fake3 > 0) {
                    break;
                } else {
                    fake2 = rand.nextInt(answer + 100);
                }
            }
            while (true) {
                if (fake3 > (answer - 100) && fake3 != answer && fake3 != fake && fake3 != fake2 && fake3 > 0) {
                    break;
                } else {
                    fake3 = rand.nextInt(answer + 100);
                }
            }
        } else if (sign == 2) {
            numb1 = rand.nextInt(900) + 100;
            numb2 = rand.nextInt(numb1);
            if (numb2 <= 0) {
                numb2 = numb2 + 1;
            }
            c = numb1 + " - " + numb2 + "?";
            answer = numb1 - numb2;
            fake2 = rand.nextInt(answer + 100);
            fake3 = rand.nextInt(answer + 100);
            while (true) {
                fake = rand.nextInt((answer + 100));
                if (fake > (answer - 100) && fake != answer && fake > 0) {
                    break;
                } else {
                    continue;
                }
            }
            while (true) {
                if (fake2 > (answer - 100) && fake2 != answer && fake2 != fake && fake3 > 0) {
                    break;
                } else {
                    fake2 = rand.nextInt(answer + 100);
                }
            }
            while (true) {
                if (fake3 > (answer - 100) && fake3 != answer && fake3 != fake && fake3 != fake2 && fake3 > 0) {
                    break;
                } else {
                    fake3 = rand.nextInt(answer + 100);
                }
            }
        } else if (sign == 3) {
            numb1 = rand.nextInt(12) + 1;
            numb2 = rand.nextInt(12) + 1;
            c = numb1 + " x " + numb2 + "?";
            answer = numb1 * numb2;
            fake = (numb1 + 1) * numb2;
            fake2 = rand.nextInt(answer + 20);
            fake3 = rand.nextInt(answer + 20);
            while (true) {
                if (fake2 > (answer - 20) && fake2 != answer && fake2 != fake && fake2 > 0) {
                    break;
                } else {
                    fake2 = rand.nextInt(answer + 20);
                }
            }
            while (true) {
                if (fake3 > (answer - 20) && fake3 != answer && fake3 != fake && fake3 != fake2 && fake2 > 0) {
                    break;
                } else {
                    fake3 = rand.nextInt(answer + 20);
                }
            }

        } else {
            numb1 = rand.nextInt(12) + 1;
            numb2 = rand.nextInt(12) + 1;
            numb3 = numb1 * numb2;
            c = numb3 + " ÷ " + numb1 + "?";
            answer = numb2;
            if (numb2 == 12) {
                fake = numb2 - 1;
            } else {
                fake = numb2 + 1;
            }
            fake2 = rand.nextInt(12) + 1;
            fake3 = rand.nextInt(12) + 1;
            while (true) {
                if (fake2 != answer && fake2 != fake && fake2 > 0) {
                    break;
                } else {
                    fake2 = rand.nextInt(12) + 1;
                }
            }
            while (true) {
                if (fake3 != answer && fake3 != fake && fake3 != fake2 && fake2 > 0) {
                    break;
                } else {
                    fake3 = rand.nextInt(12) + 1;
                }
            }

        }
        return c;
    }
    /*
    * This method, setter(), is an additional method made for setting all of the buttons of the multiple choice, after generation.
    * I will not explain it indepth, as this method is highly repetitive, but it uses two "rand" variables, one that randomly generates up to 4 and one that generates up to 3.
    * After generating one out of 4, the answer is assigned to one of the buttons, and the second random generation (out of 3) assigns the false values based around the answer (due to the false but accurate answer).
    * This method is executed in order to make the test feel more "random", and to give it less of a predictable pattern. 
    */
    public void setter() {
        int rand4 = rand.nextInt(4) + 1;
        int rand5 = rand.nextInt(3) + 1;
        if (rand4 == 1) {
            selector1.setText(answer + "");
            if (rand5 == 1) {
                selector2.setText(fake + "");
                selector3.setText(fake2 + "");
                selector4.setText(fake3 + "");
            } else if (rand5 == 2) {
                selector3.setText(fake + "");
                selector2.setText(fake2 + "");
                selector4.setText(fake3 + "");
            } else {
                selector4.setText(fake + "");
                selector3.setText(fake2 + "");
                selector2.setText(fake3 + "");
            }
        } else if (rand4 == 2) {
            selector2.setText(answer + "");
            if (rand5 == 1) {
                selector1.setText(fake + "");
                selector3.setText(fake2 + "");
                selector4.setText(fake3 + "");
            } else if (rand5 == 2) {
                selector3.setText(fake + "");
                selector1.setText(fake2 + "");
                selector4.setText(fake3 + "");
            } else {
                selector4.setText(fake + "");
                selector3.setText(fake2 + "");
                selector1.setText(fake3 + "");
            }
        } else if (rand4 == 3) {
            selector3.setText(answer + "");
            if (rand5 == 1) {
                selector1.setText(fake + "");
                selector2.setText(fake2 + "");
                selector4.setText(fake3 + "");
            } else if (rand5 == 2) {
                selector2.setText(fake + "");
                selector1.setText(fake2 + "");
                selector4.setText(fake3 + "");
            } else {
                selector4.setText(fake + "");
                selector1.setText(fake2 + "");
                selector2.setText(fake3 + "");
            }
        } else {
            selector4.setText(answer + "");
            if (rand5 == 1) {
                selector1.setText(fake + "");
                selector3.setText(fake2 + "");
                selector2.setText(fake3 + "");
            } else if (rand5 == 2) {
                selector2.setText(fake + "");
                selector3.setText(fake2 + "");
                selector1.setText(fake3 + "");
            } else {
                selector3.setText(fake + "");
                selector1.setText(fake2 + "");
                selector2.setText(fake3 + "");
            }
        }
    }

    
    
    /*
    * This method, grade(), is used to simply generate a grade and message for the user (on the results screen). 
    * Using the "correct" and "questionAmount" variables, (after quickly setting them to doubles) I calculate the percentage of the player, and I provide a different grade and encouraging message based off of their performance (by setting the text of "finalGrade" and "note" respectively).
    * There are some unique messages availible if you get all of the questions right, depending on if your calculator was on or off, and if you didn't complete the maximum amount of questions (using the indicate and questionAmount variables in order to check).
    * I use html tags at the end and beginning of the texts, so that they can automatically wrap when they are set. 
    */
    public void grade() {
        double percentage = ((double) correct / (double) questionAmount) * 100;
        if (percentage == 100) {
            finalGrade.setText("Your Grade: A++");
            if (indicate == 1 && questionAmount == 50) {    //Calculator is off
                note.setText("<html> Wow, you managed to get all of the questions right, and with the maximum amount of questions! Congratulations! \"<html>\"");
            } else if (indicate == 1) {
                note.setText("<html> Wow, you managed to get all of the questions right! For an extra challenge, try increasing the amount of questions next time :) <html>");
            } else {
                note.setText("<html> Wow, you managed to get all of the questions right! Next time, try disabling your calculator! <html>");
            }
        } else if (percentage < 100 && percentage >= 80) {
            finalGrade.setText("Your Grade: A");
            note.setText("<html> You managed to get most of the questions right! Good Job! :) <html>");
        } else if (percentage < 80 && percentage >= 60) {
            finalGrade.setText("Your Grade: B");
            note.setText("<html> Great job, you did very well, but I believe you can do even better! <html>");
        } else if (percentage < 60 && percentage >= 40) {
            finalGrade.setText("Your Grade: C");
            note.setText("<html> You did a good job, but there is still room for improvement. You can do it! :) <html>");
        } else if (percentage < 40 && percentage >= 20) {
            finalGrade.setText("Your Grade: D");
            note.setText("<html> Don't be discouraged, you can do even better next time! <html>");
        } else {
            finalGrade.setText("Your Grade: D-");
            note.setText("<html> Nice try, but I believe in you! Better luck next time! <html>");
        }
    }
    
    
        /*
        * This method, setList(), is used to create the list of wrong questions on the results screen. 
        * Here, looping for the size of the two ArrayLists, I use the data stored at the index of the ArrayLists to put together a string, which outlines one individual question. This string is then added to a ListModel.
        * If the "questions" ArrayList was found to be empty, a single positive message is added to the ListModel, to be displayed instead. Then, the list on the results screen (which is appropriately named) is then set to display the ListModel. 
        */
    public void setList() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < questions.size(); i++) {
                model.addElement(questions.get(i) + "    Correct Answer: " + answers.get(i));
            }
        if (questions.isEmpty() == true) {
            model.addElement("You got nothing wrong!");
        }
        list.setModel(model);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutUs;
    private javax.swing.JButton activateCalc1;
    private javax.swing.JButton activateCalc2;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amount;
    private javax.swing.JDialog calculator;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton enableCalculator;
    private javax.swing.JLabel errorMesg;
    private javax.swing.JLabel finalGrade;
    private javax.swing.JLabel finalScore;
    private javax.swing.JButton goBack1;
    private javax.swing.JLabel indicator;
    private javax.swing.JLabel jAnswer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JList<String> list;
    private javax.swing.JLabel message;
    private javax.swing.JLabel message1;
    private javax.swing.JButton multiple;
    private javax.swing.JDialog multipleChoice;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JLabel note;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel question;
    private javax.swing.JLabel question2;
    private javax.swing.JDialog results;
    private javax.swing.JButton selector1;
    private javax.swing.JButton selector2;
    private javax.swing.JButton selector3;
    private javax.swing.JButton selector4;
    private javax.swing.JButton start;
    private javax.swing.JButton submitAnswer;
    private javax.swing.JButton subtractButton;
    private javax.swing.JDialog testSelector;
    private javax.swing.JTextField user;
    private javax.swing.JButton written;
    private javax.swing.JDialog writtenTest;
    // End of variables declaration//GEN-END:variables
}
