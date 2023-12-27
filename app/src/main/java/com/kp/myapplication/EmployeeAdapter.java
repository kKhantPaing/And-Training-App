package com.kp.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {


    Context context;
    ArrayList<EmployeeModel> employeeModelArrayList;

    public EmployeeAdapter(Context context, ArrayList<EmployeeModel> employeeModelArrayList) {
        this.context = context;
        this.employeeModelArrayList = employeeModelArrayList;
    }

    @NonNull
    @Override
    public EmployeeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_row_view,parent,false);

        return new EmployeeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeAdapter.ViewHolder holder, int position) {

        holder.tv_name.setText(employeeModelArrayList.get(position).emp_name);
        holder.tv_role.setText(employeeModelArrayList.get(position).emp_role);
        holder.btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return employeeModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name, tv_role;
        Button btn_edit;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.empName);
            tv_role = itemView.findViewById(R.id.empRole);
            btn_edit = itemView.findViewById(R.id.btnEdit);
        }
    }
}
