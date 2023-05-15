package com.shubham.womensafety;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class DashBoardFragmentDirections {
  @NonNull
  public static ActionDashBoardFragmentToGuardianInfo actionDashBoardFragmentToGuardianInfo() {
    return new ActionDashBoardFragmentToGuardianInfo();
  }

  @NonNull
  public static ActionDashBoardFragmentToMapsActivity actionDashBoardFragmentToMapsActivity() {
    return new ActionDashBoardFragmentToMapsActivity();
  }

  public static class ActionDashBoardFragmentToGuardianInfo implements NavDirections {
    public ActionDashBoardFragmentToGuardianInfo() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.shubham.womensafety.R.id.action_dashBoardFragment_to_guardianInfo;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDashBoardFragmentToGuardianInfo that = (ActionDashBoardFragmentToGuardianInfo) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDashBoardFragmentToGuardianInfo(actionId=" + getActionId() + "){"
          + "}";
    }
  }

  public static class ActionDashBoardFragmentToMapsActivity implements NavDirections {
    public ActionDashBoardFragmentToMapsActivity() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.shubham.womensafety.R.id.action_dashBoardFragment_to_mapsActivity;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDashBoardFragmentToMapsActivity that = (ActionDashBoardFragmentToMapsActivity) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDashBoardFragmentToMapsActivity(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
