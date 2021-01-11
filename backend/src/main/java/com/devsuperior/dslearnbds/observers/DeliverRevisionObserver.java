package com.devsuperior.dslearnbds.observers;

import com.devsuperior.dslearnbds.entities.Deliver;

public interface DeliverRevisionObserver {

	public void onSaveRevision(Deliver deliver);
}
