import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

    // TODO: Make seperate function, constants for colors and other needed optimization and cleanliness
    // Creating interface wich holds buttons and functionallity
    private void createInterface() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(251, 250, 245));
        add(panel);

        // Create sort buttons
        ButtonGroup sortingAlgarithmRadio = new ButtonGroup();

        JRadioButton selectionSortRadio = new JRadioButton("Selection Sort");
        selectionSortRadio.setBounds(10, 10, 120, 25);
        selectionSortRadio.setBackground(new Color(251, 250, 245));

        JRadioButton insertionSortRadio = new JRadioButton("Insertion Sort");
        insertionSortRadio.setBounds(140, 10, 120, 25);
        insertionSortRadio.setBackground(new Color(251, 250, 245));
  
        JRadioButton heapSortRadio = new JRadioButton("Heap Sort");
        heapSortRadio.setBounds(270, 10, 120, 25);
        heapSortRadio.setBackground(new Color(251, 250, 245));

        JRadioButton mergeSortRadio = new JRadioButton("Merge Sort");
        mergeSortRadio.setBounds(400, 10, 120, 25);
        mergeSortRadio.setBackground(new Color(251, 250, 245));

        JRadioButton quickSortRadio = new JRadioButton("Quick Sort");
        quickSortRadio.setBounds(10, 45, 120, 25);
        quickSortRadio.setBackground(new Color(251, 250, 245));

        JRadioButton radixSortRadio = new JRadioButton("Radix Sort");
        radixSortRadio.setBounds(140, 45, 120, 25);
        radixSortRadio.setBackground(new Color(251, 250, 245));

        sortingAlgarithmRadio.add(selectionSortRadio);
        sortingAlgarithmRadio.add(insertionSortRadio);
        sortingAlgarithmRadio.add(heapSortRadio);
        sortingAlgarithmRadio.add(mergeSortRadio);
        sortingAlgarithmRadio.add(quickSortRadio);
        sortingAlgarithmRadio.add(radixSortRadio);

        panel.add(selectionSortRadio);
        panel.add(insertionSortRadio);
        panel.add(heapSortRadio);
        panel.add(mergeSortRadio);
        panel.add(quickSortRadio);
        panel.add(radixSortRadio);

        // Sort options
        JLabel numElementsLabel = new JLabel("Number of elements:");
        numElementsLabel.setBounds(10, 80, 120, 25);
        numElementsLabel.setBackground(new Color(251, 250, 245));
        panel.add(numElementsLabel);

        JSpinner numElements = new JSpinner();
        numElements.setBounds(140, 80, 120, 25);
        panel.add(numElements);

        // Run button
        JButton sort = new JButton("Sort");
        sort.setBounds(10, 115, 120, 25);

        sort.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                // if (selectionSortRadio.isSelected()) {}

                System.out.println("Sorting...");

            }

        });

        panel.add(sort);

        // Stats
        JLabel comparionsLabel = new JLabel("Number of comparions:");
        comparionsLabel.setBounds(10, 200, 120, 25);
        comparionsLabel.setBackground(new Color(251, 250, 245));
        panel.add(comparionsLabel);

        JSpinner numComparions = new JSpinner();
        numComparions.setBounds(140, 200, 120, 25);
        panel.add(numComparions);

        JLabel movementsLabel = new JLabel("Number of movements:");
        movementsLabel.setBounds(270, 200, 120, 25);
        movementsLabel.setBackground(new Color(251, 250, 245));
        panel.add(movementsLabel);

        JSpinner numMovements = new JSpinner();
        numMovements.setBounds(400, 200, 120, 25);
        panel.add(numMovements);

        JLabel timeLabel = new JLabel("Time taken (ms):");
        timeLabel.setBounds(10, 235, 120, 25);
        timeLabel.setBackground(new Color(251, 250, 245));
        panel.add(timeLabel);

        JSpinner timeTaken = new JSpinner();
        timeTaken.setBounds(140, 235, 120, 25);
        panel.add(timeTaken);

    }

    public Main() {

        // Create window properties
        setTitle("Sorting Algarithm Anylisis");
        setSize(600, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createInterface();

        setVisible(true);

    }

    public static void main(String[] args) {
        
        new Main();

    }

}