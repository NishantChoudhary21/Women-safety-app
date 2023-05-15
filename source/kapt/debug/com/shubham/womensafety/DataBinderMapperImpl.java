package com.shubham.womensafety;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.shubham.womensafety.databinding.ActivityMainBindingImpl;
import com.shubham.womensafety.databinding.FragmentAddGuardianBindingImpl;
import com.shubham.womensafety.databinding.FragmentDashBoardBindingImpl;
import com.shubham.womensafety.databinding.FragmentGuardianInfoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTADDGUARDIAN = 2;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 3;

  private static final int LAYOUT_FRAGMENTGUARDIANINFO = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shubham.womensafety.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shubham.womensafety.R.layout.fragment_add_guardian, LAYOUT_FRAGMENTADDGUARDIAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shubham.womensafety.R.layout.fragment_dash_board, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shubham.womensafety.R.layout.fragment_guardian_info, LAYOUT_FRAGMENTGUARDIANINFO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDGUARDIAN: {
          if ("layout/fragment_add_guardian_0".equals(tag)) {
            return new FragmentAddGuardianBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_guardian is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dash_board_0".equals(tag)) {
            return new FragmentDashBoardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dash_board is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGUARDIANINFO: {
          if ("layout/fragment_guardian_info_0".equals(tag)) {
            return new FragmentGuardianInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_guardian_info is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.shubham.womensafety.R.layout.activity_main);
      sKeys.put("layout/fragment_add_guardian_0", com.shubham.womensafety.R.layout.fragment_add_guardian);
      sKeys.put("layout/fragment_dash_board_0", com.shubham.womensafety.R.layout.fragment_dash_board);
      sKeys.put("layout/fragment_guardian_info_0", com.shubham.womensafety.R.layout.fragment_guardian_info);
    }
  }
}
