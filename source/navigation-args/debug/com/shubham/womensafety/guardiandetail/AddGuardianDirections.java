package com.shubham.womensafety.guardiandetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class AddGuardianDirections {
  @NonNull
  public static ActionAddGuardianToGuardianInfo actionAddGuardianToGuardianInfo() {
    return new ActionAddGuardianToGuardianInfo();
  }

  public static class ActionAddGuardianToGuardianInfo implements NavDirections {
    public ActionAddGuardianToGuardianInfo() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.shubham.womensafety.R.id.action_addGuardian_to_guardianInfo;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAddGuardianToGuardianInfo that = (ActionAddGuardianToGuardianInfo) object;
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
      return "ActionAddGuardianToGuardianInfo(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
