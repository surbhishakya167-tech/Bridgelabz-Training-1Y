package AIDrivenResumeScreening;

abstract class JobRole {
    String role;

    JobRole(String role) {
        this.role = role;
    }

    public String toString() {
        return role;
    }
}