import javax.swing.*;

public class VotingFrame extends JFrame {
    public static int votesA = 0, votesB = 0;
    public static boolean hasVoted = false;

    public VotingFrame() {
        setTitle("Cast Your Vote");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel voteLabel = new JLabel("Vote for your favorite candidate:");
        voteLabel.setBounds(60, 20, 250, 30);
        add(voteLabel);

        JButton btnA = new JButton("Candidate A");
        btnA.setBounds(50, 70, 110, 30);
        add(btnA);

        JButton btnB = new JButton("Candidate B");
        btnB.setBounds(180, 70, 110, 30);
        add(btnB);

        btnA.addActionListener(e -> vote("A"));
        btnB.addActionListener(e -> vote("B"));

        setVisible(true);
    }

    private void vote(String candidate) {
        if (!hasVoted) {
            if (candidate.equals("A")) votesA++;
            else votesB++;

            hasVoted = true;

            JOptionPane.showMessageDialog(this, "Vote submitted. Thank you!");

            new ResultFrame(); 

            dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "You have already voted.");
        }
    }

    public static void main(String[] args) {
        new VotingFrame(); 
    }
}
