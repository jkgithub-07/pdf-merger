package org.example;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

                PDFMergerUtility pdfMergerUtility = new PDFMergerUtility();

                try {
                    // Add source PDF files to merge
                    pdfMergerUtility.addSource("path-of-spource-file");  
                    pdfMergerUtility.addSource("path-of-merging-file");

                    // Set the destination (merged PDF)
                    pdfMergerUtility.setDestinationFileName("path-of-merged-file-to-be-saved");

                    // Perform the merge
                    pdfMergerUtility.mergeDocuments(null);
                    System.out.println("PDFs merged successfully!");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("Error merging PDFs: " + e.getMessage());
                }
            }
        }


