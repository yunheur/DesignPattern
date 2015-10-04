package updatecurrentweather;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers; // observer list
	private float �µ�, ����, ���, ǳ��; // subject ����

	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	} // observer ���� ���

	public void removeObserver(Observer o) {
		observers.remove(o);
	} // observer ���� ���

	public void notifyObservers() { // subject ���� ���� ����
		for (Observer o : observers)
			o.update(�µ�, ����, ���, ǳ��); // (note) push model
	}

	public void setMeasurements(float t, float h, float p, float w) { // ���밡 ȣ����
		�µ� = t;
		���� = h;
		��� = p;
		ǳ�� = w;
		measurementsChanged();
	}

	public void measurementsChanged() { // observer�鿡�� ���� ������ ������
		notifyObservers();
	}
}