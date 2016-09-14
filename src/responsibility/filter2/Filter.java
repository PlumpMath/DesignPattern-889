package responsibility.filter2;

public interface Filter {
	public void doFilter(Request request, Response response, FilterChain chain);
}
