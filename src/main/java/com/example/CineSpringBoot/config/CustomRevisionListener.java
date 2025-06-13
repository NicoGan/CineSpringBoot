package com.example.CineSpringBoot.config;

import com.example.CineSpringBoot.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) { final Revision revision = (Revision) revisionEntity; }
}
