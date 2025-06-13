package com.example.CineSpringBoot.entities.audit;

import com.example.CineSpringBoot.config.CustomRevisionListener;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class Revision implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "revision_seq",
            sequenceName = "rbac.seq_revision_id"
    )
    @RevisionNumber
    private Long id;

    @Column(name = "REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
