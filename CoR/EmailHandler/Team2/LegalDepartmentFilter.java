public class LegalDepartmentFilter implements AbstractFilter{
    @Override
    public void doFilter(AbstractFilter filterChain, Email email) {
        if (email.getMyType().equals("COMPLAINT")) {
            System.out.println("Forward to legal department.");
            return;
        }
        filterChain.doFilter(filterChain, email);
    }
}
