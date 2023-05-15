package com.shubham.womensafety.guardiandetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class GuardianInfoDirections {
  @NonNull
  public static ActionGuardianInfoToAddGuardian actionGuardianInfoToAddGuardian() {
    return new ActionGuardianInfoToAddGuardian();
  }

  public static class ActionGuardianInfoToAddGuardian implements NavDirections {
    public ActionGuardianInfoToAddGuardian() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.shubham.womensafety.R.id.action_guardianInfo_to_addGuardian;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGuardianInfoToAddGuardian that = (ActionGuardianInfoToAddGuardian) object;
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
      return "ActionGuardianInfoToAddGuardian(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
