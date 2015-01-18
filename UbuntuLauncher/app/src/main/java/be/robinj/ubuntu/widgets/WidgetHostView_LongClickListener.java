package be.robinj.ubuntu.widgets;

import android.appwidget.AppWidgetHostView;
import android.view.View;

import be.robinj.ubuntu.HomeActivity;

/**
 * Created by robin on 8/25/14.
 */
public class WidgetHostView_LongClickListener implements AppWidgetHostView.OnLongClickListener
{
	private WidgetContainer widgetContainer;

	public WidgetHostView_LongClickListener (WidgetContainer widgetContainer)
	{
		this.widgetContainer = widgetContainer;
	}

	@Override
	public boolean onLongClick (View view)
	{
		this.widgetContainer.setEditMode (true);

		return true;
	}
}
