package com.tit.resumescreeningsystem;

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    private String result;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        String selectionStatus = jobRole.selectionResult() ? "The Candidate is Selected" : "The Candidate is Not Selected";
        return " Resume Candidate = '" + candidateName + "'\n JobRole = '" + jobRole.getRoleName() + "'" + selectionStatus;
    }
}