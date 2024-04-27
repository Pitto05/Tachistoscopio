package app.tachi;

public interface UIEventListener {
	
	void onButtonClicked(String buttonName);
	void onSpinnerValueChanged(int value, String nome);
	void onToggleButtonChanged(Boolean val, String nome);
	void onParoleInserite(String[] parole);
}
