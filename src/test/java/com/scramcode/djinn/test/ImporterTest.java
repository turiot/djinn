package com.scramcode.djinn.test;

import com.scramcode.djinn.bytecode.importer.ClassDirectoryImporter;
import com.scramcode.djinn.bytecode.importer.EclipseProjectImporter;
import com.scramcode.djinn.db.data.DataHelper;
import com.scramcode.djinn.db.data.JavaItem;
import com.scramcode.djinn.db.data.Location;
import com.scramcode.djinn.db.data.Workspace;
import com.scramcode.djinn.util.DjinnException;
import java.io.File;
import java.util.Iterator;
import java.util.Map.Entry;
import org.junit.Test;

public class ImporterTest {

//	@Test
	public void testEclipseImport() throws DjinnException {
		EclipseProjectImporter eclipseProjectImporter = new EclipseProjectImporter(new File("."));
		eclipseProjectImporter.performImport();
	}

	@Test
	public void testClassDirectoryImport() throws DjinnException {
		System.out.println("---DEBUT");
		ClassDirectoryImporter importer = new ClassDirectoryImporter(new File("D:/data/projets/djinn/target/classes"));
		importer.performImport();
		
		Workspace workspace = DataHelper.getWorkspace();
		Iterator locations = workspace.getLocations().entrySet().iterator();
		while (locations.hasNext()) {
			Entry<Long, Location> entry = (Entry) locations.next();
			Location location = entry.getValue();
			System.out.println("location "+location.getLabel()+" "+location.getAbsolutePath());
			System.out.println("         "+location.getPackages().size());
		}
		for (JavaItem top : workspace.getTopLevelItems()) {
			System.out.println("top : "+top.getLabel());
		}
		
		System.out.println("----FIN");
	}

}
