package AIDrivenResumeScreening;
class Resume<T extends JobRole> {
    private String candidateName;
    private T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public T getRole() {
        return role;
    }

    public String toString() {
        return candidateName + " - " + role;
    }
}
