package lt.vtmc.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TransportManagerImpl implements TransportManager {

	List<Bus> buses = new ArrayList<Bus>();
	List<Passenger> passengers = new ArrayList<Passenger>();

	@Override
	public Bus createBus(String id, int seats) {
		Bus bus = new Bus(id, seats);
		buses.add(bus);
		for (Bus b : buses) {
			if (b == null || b.getId().isEmpty() || b.getId().isEmpty() || b.getSeats() == 0 || b.getSeats() < 0) {
				throw new IllegalArgumentException();
			}
		}
		return bus;
	}

	@Override
	public Passenger createPassenger(String name, String surname, int age) {
		Passenger passenger = new Passenger(name, surname, age);
		passengers.add(passenger);
		for (Passenger p : passengers) {
			if (p == null) {
				throw new NullPointerException();
			} else if (p.getName().isEmpty() || p.getSurname().isEmpty() || p.getAge() == 0) {
				throw new IllegalArgumentException();
			}
		}
		return passenger;
	}

	@Override
	public List<Passenger> findPassengersBy(String busId, PassengerPredicate predicate) {
		return null;
	}

	@Override
	public double getAveragePassengerAge(String busId) {
		double sum = 0;
		double average = 0;
		for (Passenger passenger : passengers) {
			sum += passenger.getAge();
			average = sum / passengers.size();
		}
		return average;
	}

	@Override
	public Bus getBusById(String busId) {
		if (busId == null) {
			throw new IllegalArgumentException();
		}
		return new Bus(busId, 1);
	}

	@Override
	public List<Bus> getCreatedBuses() {
		return buses;
	}

	@Override
	public Passenger getOldestPassenger(String busId) {
		passengers.sort((o1, o2) -> (int) o2.getAge() - (int) o1.getAge());
		return passengers.get(0);
	}

	@Override
	public Collection<Passenger> getOrderedPassengers(String busId) {
		return null;
	}

	@Override
	public List<Passenger> getPassengers(String busId) {
		return passengers;
	}

	@Override
	public void registerPassenger(Bus bus, int seatNo, Passenger passenger) throws SeatIsOccupiedException {
	}

}
