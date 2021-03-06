/*
 *   Copyright 2013, 2014 Daniel Pereira Coelho
 *   
 *   This file is part of the Expenses Android Application.
 *
 *   Expenses is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation in version 3.
 *
 *   Expenses is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Expenses.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.dpcsoftware.mn;

import android.os.Bundle;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;



public class EditPreferences extends SherlockPreferenceActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {    
	    super.onCreate(savedInstanceState);
	    addPreferencesFromResource(R.xml.prefs);
	    
	    ActionBar abar = getSupportActionBar();
	    abar.setTitle(R.string.editpreferences_c1);
	}
}
