package eventsdemo;

class CustomerRemovedEvent {

	public String name;

	UserRemovedEvent(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

}
