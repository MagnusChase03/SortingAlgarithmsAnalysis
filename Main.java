import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {

    // Creating interface wich holds buttons and functionallity
    private void createInterface() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        // Create sort buttons
        ButtonGroup sortingAlgarithmRadio = new ButtonGroup();

        JRadioButton selectionSortRadio = new JRadioButton("Selection Sort");
        selectionSortRadio.setBounds(10, 10, 120, 50);

        JRadioButton insertionSortRadio = new JRadioButton("Insertion Sort");
        insertionSortRadio.setBounds(140, 10, 120, 50);

        JRadioButton heapSortRadio = new JRadioButton("Heap Sort");
        heapSortRadio.setBounds(270, 10, 120, 50);

        JRadioButton mergeSortRadio = new JRadioButton("Merge Sort");
        mergeSortRadio.setBounds(400, 10, 120, 50);

        JRadioButton quickSortRadio = new JRadioButton("Quick Sort");
        quickSortRadio.setBounds(10, 70, 120, 50);

        JRadioButton radixSortRadio = new JRadioButton("Radix Sort");
        radixSortRadio.setBounds(140, 70, 120, 50);

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

    }

    public Main() {

        // Create window properties
        setTitle("Sorting Algarithm Anylisis");
        setSize(600, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createInterface();

        setVisible(true);

    }

    public static void main(String[] args) {
        
        new Main();

    }

}