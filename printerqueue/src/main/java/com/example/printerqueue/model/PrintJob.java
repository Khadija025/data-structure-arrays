package com.example.printerqueue.model;

//import com.fasterxml.jackson.annotation.JsonGetter;

import jakarta.annotation.Nullable;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PrintJob {
    private String id;
    @Nullable
    private String documentName;
    @Nullable
    private int pages;
    @Nullable
    private PrintJobPriority priority;

    @Nullable
    private LocalDateTime submissionTime = LocalDateTime.now();

    private String submittedBy;

}
