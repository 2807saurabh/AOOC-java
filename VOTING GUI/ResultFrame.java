import javax.swing.*;

public class ResultFrame extends JFrame {
    public ResultFrame() {
        setTitle("Voting Results");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel heading = new JLabel("Voting Results");
        heading.setBounds(90, 20, 200, 30);
        heading.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        add(heading);

        JLabel resultA = new JLabel("Candidate A: " + VotingFrame.votesA + " votes");
        resultA.setBounds(70, 70, 200, 25);
        add(resultA);

        JLabel resultB = new JLabel("Candidate B: " + VotingFrame.votesB + " votes");
        resultB.setBounds(70, 100, 200, 25);
        add(resultB);

        setVisible(true);
    }
}
