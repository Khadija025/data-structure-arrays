package com.example.printerqueue.service;

import com.example.printerqueue.model.PrintJob;
import java.util.List;

public interface PrinterQueueService {
    void submitPrintJob(PrintJob printJob);

    PrintJob getNextJob();

    List<PrintJob> getAllJobs();

    void clearQueue();

    int getQueueSize();

}
