public class EmailHandler {
    public FilterChain filterChain;

    public EmailHandler(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public void handle(Email email) {
        this.filterChain.doFilter(filterChain, email);
    }
}