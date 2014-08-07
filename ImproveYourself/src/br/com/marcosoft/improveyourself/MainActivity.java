package br.com.marcosoft.improveyourself;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import br.com.marcosoft.improveyourself.model.Event.EventType;
import br.com.marcosoft.improveyourself.model.Goal;
import br.com.marcosoft.improveyourself.model.UserGoal;

public class MainActivity extends ListActivity {

	private final List<UserGoal> userGoals = new ArrayList<UserGoal>();

	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		UserGoal ficarZangado = new UserGoal(null, 
				new Goal("Ficar Zangado", null));
		ficarZangado.addEvent(EventType.TEMPTATION);
		ficarZangado.addEvent(EventType.TEMPTATION);
		userGoals.add(ficarZangado);
		userGoals.add(
				new UserGoal(null, 
						new Goal("Brigar com os filhos", null)));

		setListAdapter(new UserGoalAdapter(this, userGoals));
	}

}
