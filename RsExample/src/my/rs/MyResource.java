package my.rs;

import javax.ws.rs.GET;

public class MyResource {

	int n1, n2;

	public MyResource(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@GET
	public String getSum() {
		return "" + (n1 + n2);
	}
}
