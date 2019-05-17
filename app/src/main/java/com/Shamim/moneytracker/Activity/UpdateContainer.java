package com.Shamim.moneytracker.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.Shamim.moneytracker.Fragment.CreditFragment;
import com.Shamim.moneytracker.Fragment.DebiteFragment;
import com.Shamim.moneytracker.Fragment.DepositFragment;
import com.Shamim.moneytracker.Fragment.ExpensesFragment;
import com.Shamim.moneytracker.ModelClass.Model;
import com.Shamim.moneytracker.R;

public class UpdateContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_container);

        Model model= (Model) getIntent().getSerializableExtra("dataModel");

        switch (model.getType()){
            case "Deposit":
                DepositFragment depositFragment=new DepositFragment();
                setFragment(depositFragment,model);
                break;
            case "Expenses":
                ExpensesFragment expensesFragment=new ExpensesFragment();
                setFragment(expensesFragment,model);
                break;
            case "Debit":
                DebiteFragment debiteFragment=new DebiteFragment();
                setFragment(debiteFragment,model);
                break;
            case "Credit":
                CreditFragment creditFragment=new CreditFragment();
                setFragment(creditFragment,model);
                break;
        }

    }

    private void setFragment(Fragment fragment, Model model) {
        Bundle bundle=new Bundle();
        bundle.putSerializable("data",model);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        fragment.setArguments(bundle);
        transaction.replace(R.id.updateContainer,fragment);
        //transaction.addToBackStack(null);
        transaction.commit();
    }
}
