import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class CalculatorGUI {
    private JPanel screen;
    private JTextField calculateField;
    private JPanel numberPanel;
    private JPanel functionPanel;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton division;
    private JButton multiply;
    private JButton subtraction;
    private JButton plusMinus;
    private JButton allClear;
    private JButton DELButton;
    private JButton plus;
    private JButton percent;
    private JButton zero;
    private JButton decimal;
    private JPanel bottomPanel;
    private JButton equals;

    public CalculatorGUI() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String source = e.getActionCommand();

                if (source.charAt(0) >= '0' && source.charAt(0) <= '9') {
                    if (calculateField.getText().equals("0")) {
                        calculateField.setText(source);
                    } else {
                        calculateField.setText(calculateField.getText() + source);
                    }
                } else if (source.equals(".")) {
                    if (!calculateField.getText().contains(".")) {
                        if (calculateField.getText().equals("0")) {
                            calculateField.setText("0.");
                        } else {
                            calculateField.setText(calculateField.getText() + ".");
                        }
                    }
                } else if (source.equals("+/-")) {
                    if (calculateField.getText().contains("-")) {
                        calculateField.setText(calculateField.getText().substring(1));
                    } else {
                        calculateField.setText("-" + calculateField.getText());
                    }
                } else if (source.equals("AC")) {
                    calculateField.setText("0");
                } else if (source.equals("%")) {
                    calculateField.setText(Double.toString(Double.parseDouble(calculateField.getText()) / 100));
                } else if (source.equals("DEL")) {
                    if (calculateField.getText().length() > 1) {
                        calculateField.setText(calculateField.getText().substring(0, calculateField.getText().length() - 1));
                    } else {
                        calculateField.setText("0");
                    }
                } else if (source.equals("+")) {
                    calculateField.setText(calculateField.getText() + "+");
                } else if (source.equals("-")) {
                    calculateField.setText(calculateField.getText() + "-");
                } else if (source.equals("*")) {
                    calculateField.setText(calculateField.getText() + "*");
                } else if (source.equals("÷")) {
                    calculateField.setText(calculateField.getText() + "/");
                } else if (source.equals("=")) {
                    String expression = calculateField.getText();
                    String[] operands = expression.split("[+\\-*/]");
                    String[] operators = expression.split("[0-9.]+");
                    double result = Double.parseDouble(operands[0]);
                    for (int i = 1; i < operands.length; i++) {
                        switch (operators[i]) {
                            case "+" -> result += Double.parseDouble(operands[i]);
                            case "-" -> result -= Double.parseDouble(operands[i]);
                            case "*" -> result *= Double.parseDouble(operands[i]);
                            case "/" -> result /= Double.parseDouble(operands[i]);
                        }
                    }
                    calculateField.setText(Double.toString(result));
                }
            }
        };
        seven.addActionListener(listener);
        eight.addActionListener(listener);
        nine.addActionListener(listener);
        four.addActionListener(listener);
        five.addActionListener(listener);
        six.addActionListener(listener);
        one.addActionListener(listener);
        two.addActionListener(listener);
        three.addActionListener(listener);
        plusMinus.addActionListener(listener);
        allClear.addActionListener(listener);
        percent.addActionListener(listener);
        division.addActionListener(listener);
        multiply.addActionListener(listener);
        subtraction.addActionListener(listener);
        DELButton.addActionListener(listener);
        plus.addActionListener(listener);
        zero.addActionListener(listener);
        decimal.addActionListener(listener);
        equals.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setContentPane(new CalculatorGUI().screen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        screen = new JPanel();
        screen.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        screen.setAlignmentY(0.5f);
        screen.setBackground(new Color(-16777216));
        screen.setMaximumSize(new Dimension(481, 227));
        screen.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        calculateField = new JTextField();
        calculateField.setBackground(new Color(-16777216));
        Font calculateFieldFont = this.$$$getFont$$$(null, -1, 18, calculateField.getFont());
        if (calculateFieldFont != null) calculateField.setFont(calculateFieldFont);
        calculateField.setForeground(new Color(-1576705));
        calculateField.setText("0");
        screen.add(calculateField, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 36), null, 0, false));
        numberPanel = new JPanel();
        numberPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        numberPanel.setBackground(new Color(-16777216));
        screen.add(numberPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(381, 24), null, 0, false));
        seven = new JButton();
        seven.setBackground(new Color(-12828085));
        seven.setBorderPainted(false);
        seven.setForeground(new Color(-16777216));
        seven.setText("7");
        numberPanel.add(seven, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        eight = new JButton();
        eight.setBackground(new Color(-12828085));
        eight.setBorderPainted(false);
        eight.setForeground(new Color(-16777216));
        eight.setText("8");
        numberPanel.add(eight, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nine = new JButton();
        nine.setBackground(new Color(-12828085));
        nine.setBorderPainted(false);
        nine.setForeground(new Color(-16777216));
        nine.setText("9");
        numberPanel.add(nine, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        four = new JButton();
        four.setBackground(new Color(-12828085));
        four.setBorderPainted(false);
        four.setForeground(new Color(-16777216));
        four.setText("4");
        numberPanel.add(four, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        five = new JButton();
        five.setBackground(new Color(-12828085));
        five.setBorderPainted(false);
        five.setForeground(new Color(-16777216));
        five.setText("5");
        numberPanel.add(five, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        six = new JButton();
        six.setBackground(new Color(-12828085));
        six.setBorderPainted(false);
        six.setForeground(new Color(-16777216));
        six.setText("6");
        numberPanel.add(six, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        one = new JButton();
        one.setBackground(new Color(-12828085));
        one.setBorderPainted(false);
        one.setForeground(new Color(-16777216));
        one.setText("1");
        numberPanel.add(one, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        two = new JButton();
        two.setBackground(new Color(-12828085));
        two.setBorderPainted(false);
        two.setForeground(new Color(-16777216));
        two.setText("2");
        numberPanel.add(two, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        three = new JButton();
        three.setBackground(new Color(-12828085));
        three.setBorderPainted(false);
        three.setForeground(new Color(-16777216));
        three.setText("3");
        numberPanel.add(three, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        plusMinus = new JButton();
        plusMinus.setBackground(new Color(-12828085));
        plusMinus.setBorderPainted(false);
        plusMinus.setForeground(new Color(-16777216));
        plusMinus.setText("+/-");
        numberPanel.add(plusMinus, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        allClear = new JButton();
        allClear.setBackground(new Color(-12828085));
        allClear.setBorderPainted(false);
        allClear.setForeground(new Color(-16777216));
        allClear.setText("AC");
        numberPanel.add(allClear, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        percent = new JButton();
        percent.setBackground(new Color(-12828085));
        percent.setBorderPainted(false);
        percent.setForeground(new Color(-16777216));
        percent.setText("%");
        numberPanel.add(percent, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        functionPanel = new JPanel();
        functionPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        functionPanel.setBackground(new Color(-16777216));
        screen.add(functionPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        division = new JButton();
        division.setBackground(new Color(-2461425));
        division.setBorderPainted(false);
        division.setForeground(new Color(-16777216));
        division.setText("÷");
        functionPanel.add(division, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        multiply = new JButton();
        multiply.setBackground(new Color(-2461425));
        multiply.setBorderPainted(false);
        multiply.setForeground(new Color(-16777216));
        multiply.setText("*");
        functionPanel.add(multiply, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        subtraction = new JButton();
        subtraction.setBackground(new Color(-2461425));
        subtraction.setBorderPainted(false);
        subtraction.setForeground(new Color(-16777216));
        subtraction.setText("-");
        functionPanel.add(subtraction, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        DELButton = new JButton();
        DELButton.setBackground(new Color(-2461425));
        DELButton.setBorderPainted(false);
        DELButton.setForeground(new Color(-16777216));
        DELButton.setText("DEL");
        functionPanel.add(DELButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        plus = new JButton();
        plus.setBackground(new Color(-2461425));
        plus.setBorderPainted(false);
        plus.setForeground(new Color(-16777216));
        plus.setText("+");
        functionPanel.add(plus, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        bottomPanel.setBackground(new Color(-16777216));
        screen.add(bottomPanel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        zero = new JButton();
        zero.setBackground(new Color(-12828085));
        zero.setBorderPainted(false);
        zero.setForeground(new Color(-16777216));
        zero.setText("0");
        bottomPanel.add(zero, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        decimal = new JButton();
        decimal.setBackground(new Color(-12828085));
        decimal.setBorderPainted(false);
        decimal.setForeground(new Color(-16777216));
        decimal.setText(".");
        bottomPanel.add(decimal, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        equals = new JButton();
        equals.setBackground(new Color(-2461425));
        equals.setForeground(new Color(-16777216));
        equals.setText("=");
        screen.add(equals, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return screen;
    }

}
