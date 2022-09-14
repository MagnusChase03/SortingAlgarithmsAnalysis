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

        // Array properties
        ButtonGroup arrayPropRadio = new ButtonGroup();

        JRadioButton inOrderRadio = new JRadioButton("In Order");
        inOrderRadio.setBounds(10, 80, 120, 25);
        inOrderRadio.setBackground(new Color(251, 250, 245));

        JRadioButton reverseOrderRadio = new JRadioButton("Reverse Order");
        reverseOrderRadio.setBounds(140, 80, 120, 25);
        reverseOrderRadio.setBackground(new Color(251, 250, 245));

        JRadioButton almostOrderRadio = new JRadioButton("Almost Order");
        almostOrderRadio.setBounds(270, 80, 120, 25);
        almostOrderRadio.setBackground(new Color(251, 250, 245));

        JRadioButton randomOrderRadio = new JRadioButton("Random Order");
        randomOrderRadio.setBounds(400, 80, 120, 25);
        randomOrderRadio.setBackground(new Color(251, 250, 245));

        arrayPropRadio.add(inOrderRadio);
        arrayPropRadio.add(reverseOrderRadio);
        arrayPropRadio.add(almostOrderRadio);
        arrayPropRadio.add(randomOrderRadio);

        panel.add(inOrderRadio);
        panel.add(reverseOrderRadio);
        panel.add(almostOrderRadio);
        panel.add(randomOrderRadio);

        // Sort options
        JLabel numElementsLabel = new JLabel("Number of elements:");
        numElementsLabel.setBounds(10, 115, 120, 25);
        numElementsLabel.setBackground(new Color(251, 250, 245));
        panel.add(numElementsLabel);

        JSpinner numElements = new JSpinner();
        numElements.setBounds(140, 115, 120, 25);
        panel.add(numElements);

        // Stats
        JLabel comparionsLabel = new JLabel("Number of comparions:");
        comparionsLabel.setBounds(10, 200, 120, 25);
        comparionsLabel.setBackground(new Color(251, 250, 245));
        panel.add(comparionsLabel);

        JSpinner numComparions = new JSpinner();
        numComparions.setBounds(140, 200, 120, 25);
        numComparions.setEnabled(false);
        panel.add(numComparions);

        JLabel movementsLabel = new JLabel("Number of movements:");
        movementsLabel.setBounds(270, 200, 120, 25);
        movementsLabel.setBackground(new Color(251, 250, 245));
        panel.add(movementsLabel);

        JSpinner numMovements = new JSpinner();
        numMovements.setBounds(400, 200, 120, 25);
        numMovements.setEnabled(false);
        panel.add(numMovements);

        JLabel timeLabel = new JLabel("Time taken (ms):");
        timeLabel.setBounds(10, 235, 120, 25);
        timeLabel.setBackground(new Color(251, 250, 245));
        panel.add(timeLabel);

        JSpinner timeTaken = new JSpinner();
        timeTaken.setBounds(140, 235, 120, 25);
        timeTaken.setEnabled(false);
        panel.add(timeTaken);

        // Run button
        JButton sort = new JButton("Sort");
        sort.setBounds(10, 150, 120, 25);

        sort.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                // Create array specified
                int size = ((Integer) numElements.getValue()).intValue();
                int[] sortingArray = new int[size];
                if (inOrderRadio.isSelected()) {

                    for (int i = 0; i < size; i++) {

                        sortingArray[i] = i;

                    }

                } else if (reverseOrderRadio.isSelected()) {

                    for (int i = 0; i < size; i++) {

                        sortingArray[size - i - 1] = i;

                    }

                } else if (randomOrderRadio.isSelected()) {

                    for (int i = 0; i < size; i++) {

                        sortingArray[i] = (int) (Math.random() * size);

                    }

                }

                // Sort the array
                if (selectionSortRadio.isSelected()) {

                    SelectionSort selectionSort = new SelectionSort();

                    // Time sort
                    long start = System.currentTimeMillis();
                    selectionSort.selectionSort(sortingArray);
                    long end = System.currentTimeMillis();

                    numComparions.setValue((Object) Integer.valueOf(selectionSort.getComparisons()));
                    numMovements.setValue((Object) Integer.valueOf(selectionSort.getMovements()));
                    timeTaken.setValue((Object) Integer.valueOf((int) (end - start)));

                } else if (insertionSortRadio.isSelected()) {

                    InsertionSort insertionSort = new InsertionSort();

                    // Time sort
                    long start = System.currentTimeMillis();
                    insertionSort.insertionSort(sortingArray);
                    long end = System.currentTimeMillis();

                    numComparions.setValue((Object) Integer.valueOf(insertionSort.getComparisons()));
                    numMovements.setValue((Object) Integer.valueOf(insertionSort.getMovements()));
                    timeTaken.setValue((Object) Integer.valueOf((int) (end - start)));

                }

            }

        });

        panel.add(sort);

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