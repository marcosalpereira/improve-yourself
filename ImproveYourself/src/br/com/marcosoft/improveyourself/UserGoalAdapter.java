package br.com.marcosoft.improveyourself;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import br.com.marcosoft.improveyourself.model.UserGoal;

public class UserGoalAdapter extends ArrayAdapter<UserGoal> {
  private final Context context;
  private final List<UserGoal> userGoals;

  public UserGoalAdapter(Context context, List<UserGoal> userGoals) {
    super(context, R.layout.user_goal, userGoals);
    this.context = context;
    this.userGoals = userGoals;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    LayoutInflater inflater = (LayoutInflater) context
        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View rowView = inflater.inflate(R.layout.user_goal, parent, false);
    TextView goalDescription = (TextView) rowView.findViewById(R.id.goalDescription);
    TextView goalStatus = (TextView) rowView.findViewById(R.id.goalStatus);
    UserGoal userGoal = userGoals.get(position);
    goalDescription.setText(userGoal.getDescription());
    goalStatus.setText(userGoal.getStatus());
    return rowView;
  }
} 